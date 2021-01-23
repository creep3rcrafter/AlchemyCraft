package com.alchemycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.alchemycraft.objects.blocks.BlockBase;
import com.alchemycraft.objects.blocks.machines.enginebase.BlockEngineBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<TileEntity> TILEENTITYS = new ArrayList<TileEntity>();

	public static final Block copperBlock = new BlockBase("block_copper", Material.IRON);
	public static final Block silverBlock = new BlockBase("block_silver", Material.IRON);
	public static final Block cobaltBlock = new BlockBase("block_cobalt", Material.IRON);
	public static final Block titaniumBlock = new BlockBase("block_titanium", Material.IRON);
	public static final Block hellstoneBlock = new BlockBase("block_hellstone", Material.IRON);
	public static final Block voidBlock = new BlockBase("block_void", Material.IRON);
	public static final Block bronzeBlock = new BlockBase("block_bronze", Material.IRON);
	public static final Block electrumBlock = new BlockBase("block_electrum", Material.IRON);
	public static final Block chromeBlock = new BlockBase("block_chrome", Material.IRON);
	public static final Block leadBlock = new BlockBase("block_lead", Material.IRON);
	public static final Block uraniumBlock = new BlockBase("block_uranium", Material.IRON);
	public static final Block aluminiumBlock = new BlockBase("block_aluminium", Material.IRON);
	public static final Block brassBlock = new BlockBase("block_brass", Material.IRON);
	public static final Block steelBlock = new BlockBase("block_steel", Material.IRON);
	public static final Block tinBlock = new BlockBase("block_tin", Material.IRON);
	public static final Block nickelBlock = new BlockBase("block_nickel", Material.IRON);
	public static final Block invarBlock = new BlockBase("block_invar", Material.IRON);
	public static final Block platinumBlock = new BlockBase("block_platinum", Material.IRON);
	public static final Block adimantineBlock = new BlockBase("block_adimantine", Material.IRON);
	public static final Block tungstenBlock = new BlockBase("block_tungsten", Material.IRON);
	
	public static final Block engineTesting = new BlockEngineBase("engine_testing", Material.IRON);
}
