package com.alchemycraft.objects.blocks;

import com.alchemycraft.AlchemyCraft;
import com.alchemycraft.init.BlockInit;
import com.alchemycraft.init.ItemInit;
import com.alchemycraft.util.IHasModel;
import com.alchemycraft.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID + ":" + name);
		setCreativeTab(CreativeTabs.MATERIALS);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() {
		AlchemyCraft.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
