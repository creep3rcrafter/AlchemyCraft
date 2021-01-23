package com.alchemycraft;
import com.alchemycraft.proxy.CommonProxy;
import com.alchemycraft.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class AlchemyCraft {
	
	@Instance
	public static AlchemyCraft insanceAlchemyCraft;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){}
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent event){}
}
