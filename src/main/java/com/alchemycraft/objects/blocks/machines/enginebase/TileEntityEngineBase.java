package com.alchemycraft.objects.blocks.machines.enginebase;

import cofh.core.util.helpers.BlockHelper;
import cofh.core.util.helpers.EnergyHelper;
import cofh.redstoneflux.api.IEnergyReceiver;
import cofh.redstoneflux.impl.TileEnergyHandler;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

public class TileEntityEngineBase extends TileEnergyHandler implements ITickable{
	
	protected IEnergyReceiver adjacentReceiver = null;
	protected boolean adjacentHandler = false;
	
	public TileEntityEngineBase () {
		storage.modifyEnergyStored(32000);
		storage.setMaxExtract(100);
		storage.setMaxReceive(0);
	}
	
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		BlockEngineBase block = (BlockEngineBase) getBlockType();
		IBlockState iBlockState = block.getStateFromMeta(getBlockMetadata());
		return from == iBlockState.getValue(BlockDirectional.FACING);
	}

	@Override
	public void update() {
		BlockEngineBase block = (BlockEngineBase) getBlockType();
		IBlockState iBlockState = block.getStateFromMeta(getBlockMetadata());
		if (BlockHelper.getAdjacentTileEntity(world, pos, iBlockState.getValue(BlockDirectional.FACING)) != null) {
			storage.modifyEnergyStored(-EnergyHelper.insertEnergyIntoAdjacentEnergyReceiver(this, iBlockState.getValue(BlockDirectional.FACING), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false));
		}
	}

}