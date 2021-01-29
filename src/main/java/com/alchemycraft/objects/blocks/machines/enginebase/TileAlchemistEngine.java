package com.alchemycraft.objects.blocks.machines.enginebase;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

public class TileAlchemistEngine extends TileEntityEngineBase{
	public TileAlchemistEngine () {
		storage.modifyEnergyStored(40000);
		storage.setMaxExtract(240);
		storage.setMaxReceive(0);
		
	}
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		BlockEngineBase block = (BlockEngineBase) getBlockType();
		IBlockState iBlockState = block.getStateFromMeta(getBlockMetadata());
		//D-U-N-S-W-E
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
		return canConnect;
	}

}
