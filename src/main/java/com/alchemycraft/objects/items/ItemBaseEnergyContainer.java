package com.alchemycraft.objects.items;

import cofh.redstoneflux.api.IEnergyContainerItem;
import cofh.redstoneflux.util.EnergyContainerItemWrapper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class ItemBaseEnergyContainer extends ItemBase implements IEnergyContainerItem{

	public static final String ENERGY = "Energy";

	protected int capacity;
	protected int maxReceive;
	protected int maxExtract;
	
	public ItemBaseEnergyContainer(String name, int capacity, int maxReceive, int maxExtract) {
		super(name);
		this.capacity = capacity;
		this.maxReceive = maxReceive;
		this.maxExtract = maxExtract;
	}
	
	public ItemBaseEnergyContainer(String name, CreativeTabs tab, int capacity, int maxReceive, int maxExtract) {
		super(name);
		setCreativeTab(tab);
		this.capacity = capacity;
		this.maxReceive = maxReceive;
		this.maxExtract = maxExtract;
	}
	
	//-----------------------------------------------------------
	
	public ItemBaseEnergyContainer setCapacity(int capacity) {

		this.capacity = capacity;
		return this;
	}

	
	public ItemBaseEnergyContainer setMaxTransfer(int maxTransfer) {

		setMaxReceive(maxTransfer);
		setMaxExtract(maxTransfer);
		return this;
	}

	public ItemBaseEnergyContainer setMaxReceive(int maxReceive) {

		this.maxReceive = maxReceive;
		return this;
	}

	public ItemBaseEnergyContainer setMaxExtract(int maxExtract) {

		this.maxExtract = maxExtract;
		return this;
	}
	
	//----------------------------------------------------------------------
	
	@Override
	public int receiveEnergy(ItemStack container, int maxReceive, boolean simulate) {
		if (!container.hasTagCompound()) {
			container.setTagCompound(new NBTTagCompound());
		}
		int stored = Math.min(container.getTagCompound().getInteger(ENERGY), getMaxEnergyStored(container));
		int energyReceived = Math.min(capacity - stored, Math.min(this.maxReceive, maxReceive));

		if (!simulate) {
			stored += energyReceived;
			container.getTagCompound().setInteger(ENERGY, stored);
		}
		return energyReceived;
	}

	@Override
	public int extractEnergy(ItemStack container, int maxExtract, boolean simulate) {
		if (container.getTagCompound() == null || !container.getTagCompound().hasKey(ENERGY)) {
			return 0;
		}
		int stored = Math.min(container.getTagCompound().getInteger(ENERGY), getMaxEnergyStored(container));
		int energyExtracted = Math.min(stored, Math.min(this.maxExtract, maxExtract));

		if (!simulate) {
			stored -= energyExtracted;
			container.getTagCompound().setInteger(ENERGY, stored);
		}
		return energyExtracted;
	}

	@Override
	public int getEnergyStored(ItemStack container) {
		if (container.getTagCompound() == null || !container.getTagCompound().hasKey(ENERGY)) {
			return 0;
		}
		return Math.min(container.getTagCompound().getInteger(ENERGY), getMaxEnergyStored(container));
	}

	@Override
	public int getMaxEnergyStored(ItemStack container) {
		return capacity;
	}
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {

		return new EnergyContainerItemWrapper(stack, this);
	}
	

}
