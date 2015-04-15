package com.dudebro.dudeboot.init;

import com.dudebro.dudeboot.block.BlockDudeBoot;
import com.dudebro.dudeboot.block.BlockFlag;

import cpw.mods.fml.common.registry.GameRegistry;
public class ModBlocks {

	public static final BlockDudeBoot BlockFlag = new BlockFlag(); 
	public static void init(){
		GameRegistry.registerBlock(BlockFlag, "BlockFlag");
	}
}