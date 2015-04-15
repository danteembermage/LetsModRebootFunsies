package com.dudebro.dudeboot;

import com.dudebro.dudeboot.init.ModBlocks;
import com.dudebro.dudeboot.init.ModItems;
import com.dudebro.dudeboot.proxy.Iproxy;
import com.dudebro.dudeboot.reference.Reference;
import com.dudebro.dudeboot.world.gen.WorldGeneratorFlag;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_ID, version=Reference.MOD_VERSION)
public class DudeBoot {

	@Mod.Instance(Reference.MOD_ID)
	public static DudeBoot instance;
	
	@SidedProxy(clientSide = "com.dudebro.dudeboot.proxy.ClientProxy", serverSide = "com.dudebro.dudeboot.proxy.ServerProxy")
	public static Iproxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		com.dudebro.dudeboot.configuration.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(new WorldGeneratorFlag(), 0);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
