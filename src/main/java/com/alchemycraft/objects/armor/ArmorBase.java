package com.alchemycraft.objects.armor;

import com.alchemycraft.AlchemyCraft;
import com.alchemycraft.init.ItemInit;
import com.alchemycraft.util.IHasModel;
import com.alchemycraft.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{
	
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID + ":" + name);
		setCreativeTab(CreativeTabs.COMBAT);
		ItemInit.ITEMS.add(this);
	}
	public ArmorBase(String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
