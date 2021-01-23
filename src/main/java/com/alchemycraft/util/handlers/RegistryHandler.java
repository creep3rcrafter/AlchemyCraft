package com.alchemycraft.util.handlers;

import com.alchemycraft.init.BlockInit;
import com.alchemycraft.init.ItemInit;
import com.alchemycraft.objects.blocks.machines.enginebase.TileEntityEngineBase;
import com.alchemycraft.util.IHasModel;
import com.alchemycraft.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void OnItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void OnBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		registerTileEntities();
	}
	private static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityEngineBase.class, new ResourceLocation(Reference.MODID, "tileEntityEngineBase"));
	}
	@SubscribeEvent
	public static void OnModelRegister(ModelRegistryEvent event) {
		for(Item item: ItemInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Block block: BlockInit.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}

}
