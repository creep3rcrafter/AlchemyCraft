package com.alchemycraft.objects.blocks.machines.enginebase.slots;

import com.alchemycraft.objects.blocks.machines.enginebase.TileEntityEngineBasic;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotEngineBasicFuel extends Slot{

	public SlotEngineBasicFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityEngineBasic.isItemFuel(stack);
	}
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
