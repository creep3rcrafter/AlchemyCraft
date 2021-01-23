package com.alchemycraft.objects.blocks.machines.enginebase;

import com.alchemycraft.AlchemyCraft;
import com.alchemycraft.init.BlockInit;
import com.alchemycraft.objects.blocks.BlockBaseOrientable;
import com.alchemycraft.util.IHasModel;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEngineBase extends BlockBaseOrientable implements IHasModel, ITileEntityProvider {
	public BlockEngineBase(String name, Material material) {
		super(name, material, BlockInit.engineTesting);
		setCreativeTab(CreativeTabs.REDSTONE);
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityEngineBase();
	}
	@Override
    public boolean hasTileEntity() 
    {
    	return true;
    }
	@Override
	public void registerModels() {
		AlchemyCraft.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
