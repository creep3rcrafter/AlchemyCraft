package com.alchemycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.alchemycraft.objects.armor.ArmorBase;
import com.alchemycraft.objects.items.ItemBase;
import com.alchemycraft.objects.items.ItemBaseEnergyContainer;
import com.alchemycraft.objects.tools.*;
import com.alchemycraft.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tool Materials
	/*
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
	 * STONE(1, 131, 4.0F, 1.0F, 5),
	 * IRON(2, 250, 6.0F, 2.0F, 14),
	 * DIAMOND(3, 1561, 8.0F, 3.0F, 10),
	 * GOLD(0, 32, 12.0F, 0.0F, 22);
	*/
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 210, 5.3f, 2.0f, 10);
	public static final ToolMaterial TOOL_SILVER = EnumHelper.addToolMaterial("tool_silver", 2, 230, 5.3f, 3.0f, 12);
	public static final ToolMaterial TOOL_COBALT = EnumHelper.addToolMaterial("tool_cobalt", 5, 780, 12.0f, 4.1f, 12);
	public static final ToolMaterial TOOL_TITANIUM = EnumHelper.addToolMaterial("tool_titanium", 4, 900, 12.0f, 3.5f, 12);
	public static final ToolMaterial TOOL_HELLSTONE = EnumHelper.addToolMaterial("tool_hellstone", 6, 1300, 16.0f, 9.0f, 15);
	public static final ToolMaterial TOOL_VOID = EnumHelper.addToolMaterial("tool_void", 7, 2000, 17.0f, 11.5f, 30);
	public static final ToolMaterial TOOL_BRONZE = EnumHelper.addToolMaterial("tool_bronze", 3, 430, 6.8f, 3.5f, 10);
	public static final ToolMaterial TOOL_ELECTRUM = EnumHelper.addToolMaterial("tool_electrum", 3, 60, 12.8f, 3.0f, 10);
	public static final ToolMaterial TOOL_CHROME = EnumHelper.addToolMaterial("tool_chrome", 3, 60, 12.8f, 3.0f, 10);
	public static final ToolMaterial TOOL_LEAD = EnumHelper.addToolMaterial("tool_lead", 2, 300, 5.25f, 3.5f, 8);
	public static final ToolMaterial TOOL_URANIUM = EnumHelper.addToolMaterial("tool_uranium", 5, 40, 5.25f, 3.5f, 8);
	public static final ToolMaterial TOOL_ALUMINIUM = EnumHelper.addToolMaterial("tool_aluminium", 1, 40, 5.0F, 1.0F, 22);
	public static final ToolMaterial TOOL_BRASS = EnumHelper.addToolMaterial("tool_brass", 3, 180, 7.8f, 3.5f, 10);
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 4, 540, 7.0f, 6.0f, 10);
	public static final ToolMaterial TOOL_TIN = EnumHelper.addToolMaterial("tool_tin", 2, 200, 5.3f, 2.0f, 10);
	public static final ToolMaterial TOOL_NICKEL = EnumHelper.addToolMaterial("tool_nickel", 2, 250, 6.0F, 2.0F, 12);
	public static final ToolMaterial TOOL_INVAR = EnumHelper.addToolMaterial("tool_invar", 2, 300, 6.0F, 2.0F, 12);
	public static final ToolMaterial TOOL_PLATINUM = EnumHelper.addToolMaterial("tool_platinum", 4, 100, 5.25f, 6.5f, 8);
	public static final ToolMaterial TOOL_ADIMANTINE = EnumHelper.addToolMaterial("tool_adimantine", 6, 3000, 14.0f, 9.0f, 15);
	public static final ToolMaterial TOOL_TUNGSTEN = EnumHelper.addToolMaterial("tool_tungsten", 6, 3000, 14.0f, 9.0f, 15);
	//Armor Materials														
	/*
	 * LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
	 * CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
	 * IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
	 * GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
	 * DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 * (String name, String textureName, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness)
	 */
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper",Reference.MODID+":copper", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_SILVER = EnumHelper.addArmorMaterial("armor_silver",Reference.MODID+":silver", 15, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_COBALT = EnumHelper.addArmorMaterial("armor_cobalt",Reference.MODID+":cobalt", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_TITANIUM = EnumHelper.addArmorMaterial("armor_titanium",Reference.MODID+":titanium", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_HELLSTONE = EnumHelper.addArmorMaterial("armor_hellstone",Reference.MODID+":hellstone", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_VOID = EnumHelper.addArmorMaterial("armor_void",Reference.MODID+":void", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_BRONZE = EnumHelper.addArmorMaterial("armor_bronze",Reference.MODID+":bronze", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_ELECTRUM = EnumHelper.addArmorMaterial("armor_electrum",Reference.MODID+":electrum", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_CHROME = EnumHelper.addArmorMaterial("armor_chrome",Reference.MODID+":chrome", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_LEAD = EnumHelper.addArmorMaterial("armor_lead",Reference.MODID+":lead", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_URANIUM = EnumHelper.addArmorMaterial("armor_uranium",Reference.MODID+":uranium", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_ALUMINIUM = EnumHelper.addArmorMaterial("armor_aluminium",Reference.MODID+":aluminium", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_BRASS = EnumHelper.addArmorMaterial("armor_brass",Reference.MODID+":brass", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_STEEL = EnumHelper.addArmorMaterial("armor_steel",Reference.MODID+":steel", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_TIN = EnumHelper.addArmorMaterial("armor_tin",Reference.MODID+":tin", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_NICKEL = EnumHelper.addArmorMaterial("armor_nickel",Reference.MODID+":nickel", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_INVAR = EnumHelper.addArmorMaterial("armor_invar",Reference.MODID+":invar", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_PLATINUM = EnumHelper.addArmorMaterial("armor_platinum",Reference.MODID+":platinum", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_ADIMANTINE = EnumHelper.addArmorMaterial("armor_adimantine",Reference.MODID+":adimantine", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_TUNGSTEN = EnumHelper.addArmorMaterial("armor_tungsten",Reference.MODID+":tungsten", 14, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	//Materials:-----------------------------------------------------------------------------------------------------------

	public static final Item copperIngot = new ItemBase("ingot_copper");
	public static final Item copperNugget = new ItemBase("nugget_copper");
	public static final Item copperDust = new ItemBase("dust_copper");
	public static final Item copperGear = new ItemBase("gear_copper");
	public static final Item silverIngot = new ItemBase("ingot_silver");
	public static final Item silverNugget = new ItemBase("nugget_silver");
	public static final Item silverDust = new ItemBase("dust_silver");
	public static final Item silverGear = new ItemBase("gear_silver");
	public static final Item cobaltIngot = new ItemBase("ingot_cobalt");
	public static final Item cobaltNugget = new ItemBase("nugget_cobalt");
	public static final Item cobaltDust = new ItemBase("dust_cobalt");
	public static final Item cobaltGear = new ItemBase("gear_cobalt");
	public static final Item titaniumIngot = new ItemBase("ingot_titanium");
	public static final Item titaniumNugget = new ItemBase("nugget_titanium");
	public static final Item titaniumDust = new ItemBase("dust_titanium");
	public static final Item titaniumGear = new ItemBase("gear_titanium");
	public static final Item hellstoneIngot = new ItemBase("ingot_hellstone");
	public static final Item hellstoneNugget = new ItemBase("nugget_hellstone");
	public static final Item hellstoneDust = new ItemBase("dust_hellstone");
	public static final Item hellstoneGear = new ItemBase("gear_hellstone");
	public static final Item voidIngot = new ItemBase("ingot_void");
	public static final Item voidNugget = new ItemBase("nugget_void");
	public static final Item voidDust = new ItemBase("dust_void");
	public static final Item voidGear = new ItemBase("gear_void");
	public static final Item bronzeIngot = new ItemBase("ingot_bronze");
	public static final Item bronzeNugget = new ItemBase("nugget_bronze");
	public static final Item bronzeDust = new ItemBase("dust_bronze");
	public static final Item bronzeGear = new ItemBase("gear_bronze");
	public static final Item electrumIngot = new ItemBase("ingot_electrum");
	public static final Item electrumNugget = new ItemBase("nugget_electrum");
	public static final Item electrumDust = new ItemBase("dust_electrum");
	public static final Item electrumGear = new ItemBase("gear_electrum");
	public static final Item chromeIngot = new ItemBase("ingot_chrome");
	public static final Item chromeNugget = new ItemBase("nugget_chrome");
	public static final Item chromeDust = new ItemBase("dust_chrome");
	public static final Item chromeGear = new ItemBase("gear_chrome");
	public static final Item leadIngot = new ItemBase("ingot_lead");
	public static final Item leadNugget = new ItemBase("nugget_lead");
	public static final Item leadDust = new ItemBase("dust_lead");
	public static final Item leadGear = new ItemBase("gear_lead");
	public static final Item uraniumIngot = new ItemBase("ingot_uranium");
	public static final Item uraniumNugget = new ItemBase("nugget_uranium");
	public static final Item uraniumDust = new ItemBase("dust_uranium");
	public static final Item uraniumGear = new ItemBase("gear_uranium");
	public static final Item aluminiumIngot = new ItemBase("ingot_aluminium");
	public static final Item aluminiumNugget = new ItemBase("nugget_aluminium");
	public static final Item aluminiumDust = new ItemBase("dust_aluminium");
	public static final Item aluminiumGear = new ItemBase("gear_aluminium");
	public static final Item brassIngot = new ItemBase("ingot_brass");
	public static final Item brassNugget = new ItemBase("nugget_brass");
	public static final Item brassDust = new ItemBase("dust_brass");
	public static final Item brassGear = new ItemBase("gear_brass");
	public static final Item steelIngot = new ItemBase("ingot_steel");
	public static final Item steelNugget = new ItemBase("nugget_steel");
	public static final Item steelDust = new ItemBase("dust_steel");
	public static final Item steelGear = new ItemBase("gear_steel");
	public static final Item tinIngot = new ItemBase("ingot_tin");
	public static final Item tinNugget = new ItemBase("nugget_tin");
	public static final Item tinDust = new ItemBase("dust_tin");
	public static final Item tinGear = new ItemBase("gear_tin");
	public static final Item nickelIngot = new ItemBase("ingot_nickel");
	public static final Item nickelNugget = new ItemBase("nugget_nickel");
	public static final Item nickelDust = new ItemBase("dust_nickel");
	public static final Item nickelGear = new ItemBase("gear_nickel");
	public static final Item invarIngot = new ItemBase("ingot_invar");
	public static final Item invarNugget = new ItemBase("nugget_invar");
	public static final Item invarDust = new ItemBase("dust_invar");
	public static final Item invarGear = new ItemBase("gear_invar");
	public static final Item platinumIngot = new ItemBase("ingot_platinum");
	public static final Item platinumNugget = new ItemBase("nugget_platinum");
	public static final Item platinumDust = new ItemBase("dust_platinum");
	public static final Item platinumGear = new ItemBase("gear_platinum");
	public static final Item adimantineIngot = new ItemBase("ingot_adimantine");
	public static final Item adimantineNugget = new ItemBase("nugget_adimantine");
	public static final Item adimantineDust = new ItemBase("dust_adimantine");
	public static final Item adimantineGear = new ItemBase("gear_adimantine");
	public static final Item tungstenIngot = new ItemBase("ingot_tungsten");
	public static final Item tungstenNugget = new ItemBase("nugget_tungsten");
	public static final Item tungstenDust = new ItemBase("dust_tungsten");
	public static final Item tungstenGear = new ItemBase("gear_tungsten");

	//Tools:-----------------------------------------------------------------------------------------------------------

	public static final Item copperSword = new ToolSword("sword_copper", TOOL_COPPER);
	public static final Item copperPickaxe = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item copperShovel = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item copperHoe = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item silverSword = new ToolSword("sword_silver", TOOL_SILVER);
	public static final Item silverPickaxe = new ToolPickaxe("pickaxe_silver", TOOL_SILVER);
	public static final Item silverShovel = new ToolShovel("shovel_silver", TOOL_SILVER);
	public static final Item silverHoe = new ToolHoe("hoe_silver", TOOL_SILVER);
	public static final Item cobaltSword = new ToolSword("sword_cobalt", TOOL_COBALT);
	public static final Item cobaltPickaxe = new ToolPickaxe("pickaxe_cobalt", TOOL_COBALT);
	public static final Item cobaltShovel = new ToolShovel("shovel_cobalt", TOOL_COBALT);
	public static final Item cobaltHoe = new ToolHoe("hoe_cobalt", TOOL_COBALT);
	public static final Item titaniumSword = new ToolSword("sword_titanium", TOOL_TITANIUM);
	public static final Item titaniumPickaxe = new ToolPickaxe("pickaxe_titanium", TOOL_TITANIUM);
	public static final Item titaniumShovel = new ToolShovel("shovel_titanium", TOOL_TITANIUM);
	public static final Item titaniumHoe = new ToolHoe("hoe_titanium", TOOL_TITANIUM);
	public static final Item hellstoneSword = new ToolSword("sword_hellstone", TOOL_HELLSTONE);
	public static final Item hellstonePickaxe = new ToolPickaxe("pickaxe_hellstone", TOOL_HELLSTONE);
	public static final Item hellstoneShovel = new ToolShovel("shovel_hellstone", TOOL_HELLSTONE);
	public static final Item hellstoneHoe = new ToolHoe("hoe_hellstone", TOOL_HELLSTONE);
	public static final Item voidSword = new ToolSword("sword_void", TOOL_VOID);
	public static final Item voidPickaxe = new ToolPickaxe("pickaxe_void", TOOL_VOID);
	public static final Item voidShovel = new ToolShovel("shovel_void", TOOL_VOID);
	public static final Item voidHoe = new ToolHoe("hoe_void", TOOL_VOID);
	public static final Item bronzeSword = new ToolSword("sword_bronze", TOOL_BRONZE);
	public static final Item bronzePickaxe = new ToolPickaxe("pickaxe_bronze", TOOL_BRONZE);
	public static final Item bronzeShovel = new ToolShovel("shovel_bronze", TOOL_BRONZE);
	public static final Item bronzeHoe = new ToolHoe("hoe_bronze", TOOL_BRONZE);
	public static final Item electrumSword = new ToolSword("sword_electrum", TOOL_ELECTRUM);
	public static final Item electrumPickaxe = new ToolPickaxe("pickaxe_electrum", TOOL_ELECTRUM);
	public static final Item electrumShovel = new ToolShovel("shovel_electrum", TOOL_ELECTRUM);
	public static final Item electrumHoe = new ToolHoe("hoe_electrum", TOOL_ELECTRUM);
	public static final Item chromeSword = new ToolSword("sword_chrome", TOOL_CHROME);
	public static final Item chromePickaxe = new ToolPickaxe("pickaxe_chrome", TOOL_CHROME);
	public static final Item chromeShovel = new ToolShovel("shovel_chrome", TOOL_CHROME);
	public static final Item chromeHoe = new ToolHoe("hoe_chrome", TOOL_CHROME);
	public static final Item leadSword = new ToolSword("sword_lead", TOOL_LEAD);
	public static final Item leadPickaxe = new ToolPickaxe("pickaxe_lead", TOOL_LEAD);
	public static final Item leadShovel = new ToolShovel("shovel_lead", TOOL_LEAD);
	public static final Item leadHoe = new ToolHoe("hoe_lead", TOOL_LEAD);
	public static final Item uraniumSword = new ToolSword("sword_uranium", TOOL_URANIUM);
	public static final Item uraniumPickaxe = new ToolPickaxe("pickaxe_uranium", TOOL_URANIUM);
	public static final Item uraniumShovel = new ToolShovel("shovel_uranium", TOOL_URANIUM);
	public static final Item uraniumHoe = new ToolHoe("hoe_uranium", TOOL_URANIUM);
	public static final Item aluminiumSword = new ToolSword("sword_aluminium", TOOL_ALUMINIUM);
	public static final Item aluminiumPickaxe = new ToolPickaxe("pickaxe_aluminium", TOOL_ALUMINIUM);
	public static final Item aluminiumShovel = new ToolShovel("shovel_aluminium", TOOL_ALUMINIUM);
	public static final Item aluminiumHoe = new ToolHoe("hoe_aluminium", TOOL_ALUMINIUM);
	public static final Item brassSword = new ToolSword("sword_brass", TOOL_BRASS);
	public static final Item brassPickaxe = new ToolPickaxe("pickaxe_brass", TOOL_BRASS);
	public static final Item brassShovel = new ToolShovel("shovel_brass", TOOL_BRASS);
	public static final Item brassHoe = new ToolHoe("hoe_brass", TOOL_BRASS);
	public static final Item steelSword = new ToolSword("sword_steel", TOOL_STEEL);
	public static final Item steelPickaxe = new ToolPickaxe("pickaxe_steel", TOOL_STEEL);
	public static final Item steelShovel = new ToolShovel("shovel_steel", TOOL_STEEL);
	public static final Item steelHoe = new ToolHoe("hoe_steel", TOOL_STEEL);
	public static final Item tinSword = new ToolSword("sword_tin", TOOL_TIN);
	public static final Item tinPickaxe = new ToolPickaxe("pickaxe_tin", TOOL_TIN);
	public static final Item tinShovel = new ToolShovel("shovel_tin", TOOL_TIN);
	public static final Item tinHoe = new ToolHoe("hoe_tin", TOOL_TIN);
	public static final Item nickelSword = new ToolSword("sword_nickel", TOOL_NICKEL);
	public static final Item nickelPickaxe = new ToolPickaxe("pickaxe_nickel", TOOL_NICKEL);
	public static final Item nickelShovel = new ToolShovel("shovel_nickel", TOOL_NICKEL);
	public static final Item nickelHoe = new ToolHoe("hoe_nickel", TOOL_NICKEL);
	public static final Item invarSword = new ToolSword("sword_invar", TOOL_INVAR);
	public static final Item invarPickaxe = new ToolPickaxe("pickaxe_invar", TOOL_INVAR);
	public static final Item invarShovel = new ToolShovel("shovel_invar", TOOL_INVAR);
	public static final Item invarHoe = new ToolHoe("hoe_invar", TOOL_INVAR);
	public static final Item platinumSword = new ToolSword("sword_platinum", TOOL_PLATINUM);
	public static final Item platinumPickaxe = new ToolPickaxe("pickaxe_platinum", TOOL_PLATINUM);
	public static final Item platinumShovel = new ToolShovel("shovel_platinum", TOOL_PLATINUM);
	public static final Item platinumHoe = new ToolHoe("hoe_platinum", TOOL_PLATINUM);
	public static final Item adimantineSword = new ToolSword("sword_adimantine", TOOL_ADIMANTINE);
	public static final Item adimantinePickaxe = new ToolPickaxe("pickaxe_adimantine", TOOL_ADIMANTINE);
	public static final Item adimantineShovel = new ToolShovel("shovel_adimantine", TOOL_ADIMANTINE);
	public static final Item adimantineHoe = new ToolHoe("hoe_adimantine", TOOL_ADIMANTINE);
	public static final Item tungstenSword = new ToolSword("sword_tungsten", TOOL_TUNGSTEN);
	public static final Item tungstenPickaxe = new ToolPickaxe("pickaxe_tungsten", TOOL_TUNGSTEN);
	public static final Item tungstenShovel = new ToolShovel("shovel_tungsten", TOOL_TUNGSTEN);
	public static final Item tungstenHoe = new ToolHoe("hoe_tungsten", TOOL_TUNGSTEN);

	//Armor:-----------------------------------------------------------------------------------------------------------

	public static final Item copperHelmet = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item copperChestplate = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item copperLeggings = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item copperBoots = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
	public static final Item silverHelmet = new ArmorBase("helmet_silver", ARMOR_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item silverChestplate = new ArmorBase("chestplate_silver", ARMOR_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item silverLeggings = new ArmorBase("leggings_silver", ARMOR_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item silverBoots = new ArmorBase("boots_silver", ARMOR_SILVER, 1, EntityEquipmentSlot.FEET);
	public static final Item cobaltHelmet = new ArmorBase("helmet_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.HEAD);
	public static final Item cobaltChestplate = new ArmorBase("chestplate_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.CHEST);
	public static final Item cobaltLeggings = new ArmorBase("leggings_cobalt", ARMOR_COBALT, 2, EntityEquipmentSlot.LEGS);
	public static final Item cobaltBoots = new ArmorBase("boots_cobalt", ARMOR_COBALT, 1, EntityEquipmentSlot.FEET);
	public static final Item titaniumHelmet = new ArmorBase("helmet_titanium", ARMOR_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item titaniumChestplate = new ArmorBase("chestplate_titanium", ARMOR_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item titaniumLeggings = new ArmorBase("leggings_titanium", ARMOR_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item titaniumBoots = new ArmorBase("boots_titanium", ARMOR_TITANIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item hellstoneHelmet = new ArmorBase("helmet_hellstone", ARMOR_HELLSTONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item hellstoneChestplate = new ArmorBase("chestplate_hellstone", ARMOR_HELLSTONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item hellstoneLeggings = new ArmorBase("leggings_hellstone", ARMOR_HELLSTONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item hellstoneBoots = new ArmorBase("boots_hellstone", ARMOR_HELLSTONE, 1, EntityEquipmentSlot.FEET);
	public static final Item voidHelmet = new ArmorBase("helmet_void", ARMOR_VOID, 1, EntityEquipmentSlot.HEAD);
	public static final Item voidChestplate = new ArmorBase("chestplate_void", ARMOR_VOID, 1, EntityEquipmentSlot.CHEST);
	public static final Item voidLeggings = new ArmorBase("leggings_void", ARMOR_VOID, 2, EntityEquipmentSlot.LEGS);
	public static final Item voidBoots = new ArmorBase("boots_void", ARMOR_VOID, 1, EntityEquipmentSlot.FEET);
	public static final Item bronzeHelmet = new ArmorBase("helmet_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item bronzeChestplate = new ArmorBase("chestplate_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item bronzeLeggings = new ArmorBase("leggings_bronze", ARMOR_BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item bronzeBoots = new ArmorBase("boots_bronze", ARMOR_BRONZE, 1, EntityEquipmentSlot.FEET);
	public static final Item electrumHelmet = new ArmorBase("helmet_electrum", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item electrumChestplate = new ArmorBase("chestplate_electrum", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item electrumLeggings = new ArmorBase("leggings_electrum", ARMOR_ELECTRUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item electrumBoots = new ArmorBase("boots_electrum", ARMOR_ELECTRUM, 1, EntityEquipmentSlot.FEET);
	public static final Item chromeHelmet = new ArmorBase("helmet_chrome", ARMOR_CHROME, 1, EntityEquipmentSlot.HEAD);
	public static final Item chromeChestplate = new ArmorBase("chestplate_chrome", ARMOR_CHROME, 1, EntityEquipmentSlot.CHEST);
	public static final Item chromeLeggings = new ArmorBase("leggings_chrome", ARMOR_CHROME, 2, EntityEquipmentSlot.LEGS);
	public static final Item chromeBoots = new ArmorBase("boots_chrome", ARMOR_CHROME, 1, EntityEquipmentSlot.FEET);
	public static final Item leadHelmet = new ArmorBase("helmet_lead", ARMOR_LEAD, 1, EntityEquipmentSlot.HEAD);
	public static final Item leadChestplate = new ArmorBase("chestplate_lead", ARMOR_LEAD, 1, EntityEquipmentSlot.CHEST);
	public static final Item leadLeggings = new ArmorBase("leggings_lead", ARMOR_LEAD, 2, EntityEquipmentSlot.LEGS);
	public static final Item leadBoots = new ArmorBase("boots_lead", ARMOR_LEAD, 1, EntityEquipmentSlot.FEET);
	public static final Item uraniumHelmet = new ArmorBase("helmet_uranium", ARMOR_URANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item uraniumChestplate = new ArmorBase("chestplate_uranium", ARMOR_URANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item uraniumLeggings = new ArmorBase("leggings_uranium", ARMOR_URANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item uraniumBoots = new ArmorBase("boots_uranium", ARMOR_URANIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item aluminiumHelmet = new ArmorBase("helmet_aluminium", ARMOR_ALUMINIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item aluminiumChestplate = new ArmorBase("chestplate_aluminium", ARMOR_ALUMINIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item aluminiumLeggings = new ArmorBase("leggings_aluminium", ARMOR_ALUMINIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item aluminiumBoots = new ArmorBase("boots_aluminium", ARMOR_ALUMINIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item brassHelmet = new ArmorBase("helmet_brass", ARMOR_BRASS, 1, EntityEquipmentSlot.HEAD);
	public static final Item brassChestplate = new ArmorBase("chestplate_brass", ARMOR_BRASS, 1, EntityEquipmentSlot.CHEST);
	public static final Item brassLeggings = new ArmorBase("leggings_brass", ARMOR_BRASS, 2, EntityEquipmentSlot.LEGS);
	public static final Item brassBoots = new ArmorBase("boots_brass", ARMOR_BRASS, 1, EntityEquipmentSlot.FEET);
	public static final Item steelHelmet = new ArmorBase("helmet_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item steelChestplate = new ArmorBase("chestplate_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item steelLeggings = new ArmorBase("leggings_steel", ARMOR_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item steelBoots = new ArmorBase("boots_steel", ARMOR_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item tinHelmet = new ArmorBase("helmet_tin", ARMOR_TIN, 1, EntityEquipmentSlot.HEAD);
	public static final Item tinChestplate = new ArmorBase("chestplate_tin", ARMOR_TIN, 1, EntityEquipmentSlot.CHEST);
	public static final Item tinLeggings = new ArmorBase("leggings_tin", ARMOR_TIN, 2, EntityEquipmentSlot.LEGS);
	public static final Item tinBoots = new ArmorBase("boots_tin", ARMOR_TIN, 1, EntityEquipmentSlot.FEET);
	public static final Item nickelHelmet = new ArmorBase("helmet_nickel", ARMOR_NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item nickelChestplate = new ArmorBase("chestplate_nickel", ARMOR_NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item nickelLeggings = new ArmorBase("leggings_nickel", ARMOR_NICKEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item nickelBoots = new ArmorBase("boots_nickel", ARMOR_NICKEL, 1, EntityEquipmentSlot.FEET);
	public static final Item invarHelmet = new ArmorBase("helmet_invar", ARMOR_INVAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item invarChestplate = new ArmorBase("chestplate_invar", ARMOR_INVAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item invarLeggings = new ArmorBase("leggings_invar", ARMOR_INVAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item invarBoots = new ArmorBase("boots_invar", ARMOR_INVAR, 1, EntityEquipmentSlot.FEET);
	public static final Item platinumHelmet = new ArmorBase("helmet_platinum", ARMOR_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item platinumChestplate = new ArmorBase("chestplate_platinum", ARMOR_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item platinumLeggings = new ArmorBase("leggings_platinum", ARMOR_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item platinumBoots = new ArmorBase("boots_platinum", ARMOR_PLATINUM, 1, EntityEquipmentSlot.FEET);
	public static final Item adimantineHelmet = new ArmorBase("helmet_adimantine", ARMOR_ADIMANTINE, 1, EntityEquipmentSlot.HEAD);
	public static final Item adimantineChestplate = new ArmorBase("chestplate_adimantine", ARMOR_ADIMANTINE, 1, EntityEquipmentSlot.CHEST);
	public static final Item adimantineLeggings = new ArmorBase("leggings_adimantine", ARMOR_ADIMANTINE, 2, EntityEquipmentSlot.LEGS);
	public static final Item adimantineBoots = new ArmorBase("boots_adimantine", ARMOR_ADIMANTINE, 1, EntityEquipmentSlot.FEET);
	public static final Item tungstenHelmet = new ArmorBase("helmet_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item tungstenChestplate = new ArmorBase("chestplate_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item tungstenLeggings = new ArmorBase("leggings_tungsten", ARMOR_TUNGSTEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item tungstenBoots = new ArmorBase("boots_tungsten", ARMOR_TUNGSTEN, 1, EntityEquipmentSlot.FEET);
	//Items Gems
	public static final Item gemRuby = new ItemBase("gem_ruby");
	public static final Item gemSapphire = new ItemBase("gem_sapphire");
	public static final Item gemTopaz = new ItemBase("gem_topaz");
	public static final Item gemRosequartz = new ItemBase("gem_rosequartz");
	public static final Item gemAmethyst = new ItemBase("gem_amethyst");
	//Random Items
	public static final Item basicBattery = new ItemBaseEnergyContainer("basic_battery", CreativeTabs.REDSTONE, 10000, 100, 100);
	
	
	
	
}
