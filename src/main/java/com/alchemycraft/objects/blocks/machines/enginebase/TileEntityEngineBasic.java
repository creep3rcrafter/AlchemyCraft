package com.alchemycraft.objects.blocks.machines.enginebase;

import cofh.core.util.helpers.BlockHelper;
import cofh.core.util.helpers.EnergyHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityEngineBasic extends TileEntityEngineBase implements IInventory, ITickable{
	private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);
	private String customName;
	
	private int burnTime;
	private int currentBurnTime;
	private int totalGenerateTime;
	private int generateTime;
	private int MaxGenerateTime = 300;
	
	public TileEntityEngineBasic () {
		storage.setCapacity(32000);
		storage.setMaxExtract(120);
		storage.setMaxReceive(0);
	}
	
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		BlockEngineBase block = (BlockEngineBase) getBlockType();
		IBlockState iBlockState = block.getStateFromMeta(getBlockMetadata());
		//D-U-N-S-W-E
		boolean canConnect = false;
		canConnect = from == iBlockState.getValue(BlockEngineBase.FACING);
		return true;
	}
	@Override
	public String getName() {
		return this.hasCustomName() ? this.customName : "container.engine_basic";
	}
	@Override
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.isEmpty();
	}
	
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	@Override
	public ITextComponent getDisplayName() {
		return this.hasCustomName() ?  new TextComponentString(this.getName()) : new TextComponentString(this.getName());
	}
	@Override
	public int getSizeInventory() {
		return this.inventory.size();
	}
	@Override
	public boolean isEmpty() {
		for (ItemStack stack : this.inventory) {
			if(!stack.isEmpty()) return false;
		}
		return true;
	}
	@Override
	public ItemStack getStackInSlot(int index) {
		return (ItemStack)this.inventory.get(index);
	}
	@Override
	public ItemStack decrStackSize(int index, int count) {
		return ItemStackHelper.getAndSplit(this.inventory, index, count);
	}
	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(this.inventory, index);
	}
	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		ItemStack itemStack = (ItemStack)this.inventory.get(index);
		boolean flag  = !stack.isEmpty() && stack.isItemEqual(itemStack) && ItemStack.areItemStackTagsEqual(stack, itemStack);
		this.inventory.set(index, stack);
		
		if (stack.getCount() > this.getInventoryStackLimit()) {
			stack.setCount(this.getInventoryStackLimit());
		}
		if (index == 0 && !flag) {
			ItemStack stack1 = (ItemStack)this.inventory.get(index);
			this.totalGenerateTime = 300;
			this.burnTime = 0;
			storage.modifyEnergyStored(100);
			//this.markDirty();
		}
	}
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		//super.readFromNBT(compound);
		this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.inventory);
		this.burnTime = compound.getInteger("BurnTime");
		this.generateTime = compound.getInteger("GenerateTime");
		this.totalGenerateTime = compound.getInteger("TotalGenerateTime");
		this.currentBurnTime = getItemBurnTime((ItemStack)this.inventory.get(1));
		this.storage.readFromNBT(compound);
		
		if (compound.hasKey("customName", 8)) this.setCustomName(compound.getString("CustomName"));
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		//super.writeToNBT(compound);
		compound.setInteger("BurnTime", (short)this.burnTime);
		compound.setInteger("GenerateTime", (short)this.generateTime);
		compound.setInteger("TotalGenerateTime", (short)this.totalGenerateTime);
		ItemStackHelper.saveAllItems(compound, this.inventory);
		if(this.hasCustomName()) compound.setString("CustomName", this.customName);
		storage.writeToNBT(compound);
		return compound;
	}
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	public boolean isBurning() {
		return this.burnTime > 0;
	}
	@SideOnly(Side.CLIENT)
	public static boolean isBurning(IInventory inventory){
		return inventory.getField(0) > 0;
	}
	
	@Override
	public void update() {
	
		boolean flag = this.isBurning();
		boolean flag1 = false;
		if (this.isBurning()) --this.burnTime;
		if(!this.world.isRemote) {
			ItemStack stack = (ItemStack)this.inventory.get(0);
			if (this.isBurning() || !stack.isEmpty()){
				this.burnTime = getItemBurnTime(stack);
				this.currentBurnTime = this.burnTime;
				
				if(this.isBurning()) {
					flag1 = true;
					if(!stack.isEmpty()) {
						Item item = stack.getItem();
						stack.shrink(1);
						if(stack.isEmpty()) {
							ItemStack item1 = item.getContainerItem(stack);
							this.inventory.set(0, item1);
						}
					}
				}
			}
			if (this.isBurning() && this.canGenerate()) {
				++this.generateTime;
				if (this.generateTime == this.totalGenerateTime) {
					this.generateTime = 0;
					this.totalGenerateTime = this.MaxGenerateTime;
					this.storage.modifyEnergyStored(400);
					flag1 = true;
				}
			}
			else this.generateTime = 0;
		}
		else if (!this.isBurning() && this.generateTime > 0) 
		{
			this.generateTime = MathHelper.clamp(this.generateTime - 2, 0, this.totalGenerateTime);
		}
		if (flag != this.isBurning()) {
			flag1 = true;
		}
		if(flag1) {
			this.markDirty();
		}
	}
	private boolean canGenerate() {
		if (this.storage.getEnergyStored() < this.storage.getMaxEnergyStored()) {
			return true;
		}else {
			return false;
		}
	}
	public static int getItemBurnTime(ItemStack fuel) {
		if (fuel.isEmpty()) return 0;
		else {
			Item item = fuel.getItem();
			if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR) {
				Block block = Block.getBlockFromItem(item);
				if (block == Blocks.WOODEN_SLAB) return 150;
				if (block.getDefaultState().getMaterial() == Material.WOOD) return 300;
				if (block == Blocks.COAL_BLOCK) return 16000;
			}
			if(item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) return 200;
			if(item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) return 200;
			if(item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) return 200;
			if(item == Items.STICK) return 100;
			if(item == Items.COAL) return 1600;
			if(item == Items.LAVA_BUCKET) return 20000;
			if(item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
			if(item == Items.BLAZE_ROD) return 2400;
			
			return GameRegistry.getFuelValue(fuel);
		}
	}
	public static boolean isItemFuel(ItemStack fuel) {
		return getItemBurnTime(fuel) > 0;
	}
	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX()+0.5D, (double)this.pos.getY()+0.5D,(double)this.pos.getZ()+0.5D) <= 64;
	}
	@Override
	public void openInventory(EntityPlayer player) {}
	@Override
	public void closeInventory(EntityPlayer player) {}
	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return isItemFuel(stack);
	}
	public String getGuiID() {
		return "alchemycraft:engine_basic";
	}
	@Override
	public int getField(int id) {
		switch (id) {
		case 0:
			return this.burnTime;
		case 1:
			return this.currentBurnTime;
		case 2:
			return this.generateTime;
		case 3:
			return this.totalGenerateTime;
		default:
			return 0;
		}
	}
	@Override
	public void setField(int id, int value) {
		switch (id) {
		case 0:
			this.burnTime = value;
		case 1:
			this.currentBurnTime = value;
		case 2:
			this.generateTime = value;
		case 3:
			this.totalGenerateTime = value;
		}
	}
	@Override
	public int getFieldCount() {
		return 4;
	}
	@Override
	public void clear() {
		this.inventory.clear();
	}
}
