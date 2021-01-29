package com.alchemycraft.objects.blocks.machines.enginebase;

import java.util.Random;

import com.alchemycraft.AlchemyCraft;
import com.alchemycraft.init.BlockInit;
import com.alchemycraft.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockEngineBasic extends BlockEngineBase{

	public BlockEngineBasic(String name, Material material, Block block) {
		super(name, material, block);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityEngineBasic();
	}
	@Override
	public void registerModels() {
		AlchemyCraft.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockInit.engineBasic);
	}
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BlockInit.engineBasic);
	}
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			playerIn.openGui(AlchemyCraft.insanceAlchemyCraft, Reference.GUI_ENGINE_BASIC, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntityEngineBasic tileEntity = (TileEntityEngineBasic)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
		super.breakBlock(worldIn, pos, state);
	}
}
