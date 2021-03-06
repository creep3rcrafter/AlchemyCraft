package com.alchemycraft.objects.blocks.machines.enginebase;

import cofh.core.util.helpers.BlockHelper;
import cofh.core.util.helpers.EnergyHelper;
import cofh.redstoneflux.impl.TileEnergyHandler;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import scala.tools.nsc.doc.base.comment.Bold;

public class TileEntityEngineBase extends TileEnergyHandler implements ITickable{
	
	boolean[] faces = {true,true,true,true };
	
	public TileEntityEngineBase () {
		storage.modifyEnergyStored(0);
		storage.setMaxExtract(0);
		storage.setMaxReceive(0);
		//faces = Faces;
		
	}
	
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		BlockEngineBase block = (BlockEngineBase) getBlockType();
		IBlockState iBlockState = block.getStateFromMeta(getBlockMetadata());
		//D-U-N-S-W-E
		/*
		boolean canConnect = false;
		if (getBlockMetadata() % 2 == 1) {
			canConnect =
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 1) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 2) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 3) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 4);
		}else{
			canConnect =
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 2) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 3) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 4) ||
			from == iBlockState.getValue(BlockEngineBase.FACING).getFront(getBlockMetadata() + 5);
		}
		*/
		return true;
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