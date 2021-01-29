package com.alchemycraft.objects.blocks.machines.enginebase;

import com.alchemycraft.AlchemyCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAlchemistEngine extends BlockEngineBase{

	public BlockAlchemistEngine(String name, Material material, Block block) {
		super(name, material, block);
	}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileAlchemistEngine();
	}
	@Override
	public void registerModels() {
		AlchemyCraft.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
