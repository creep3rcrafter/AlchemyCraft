package com.alchemycraft.objects.tools;

import com.alchemycraft.AlchemyCraft;
import com.alchemycraft.init.ItemInit;
import com.alchemycraft.util.IHasModel;
import com.alchemycraft.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	public ToolAxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID + ":" + name);
		setCreativeTab(CreativeTabs.TOOLS);
		ItemInit.ITEMS.add(this);
	}
	public ToolAxe(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID + ":" + name);
		setCreativeTab(tab);
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		AlchemyCraft.proxy.RegisterItemRenderer(this, 0, "inventory");
	}

}
