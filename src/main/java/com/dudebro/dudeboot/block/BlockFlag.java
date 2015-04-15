package com.dudebro.dudeboot.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

import com.dudebro.dudeboot.init.ModBlocks;
import com.dudebro.dudeboot.reference.Reference;

import net.minecraft.world.World;

public class BlockFlag extends BlockDudeBoot {

	public BlockFlag(){
		super();
		this.setBlockName("Nutella");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName(Reference.MOD_ID + ":Nutella");
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitx, float hity, float hitz){
		//for(int i = 0; i<10; i++){
		//	world.setBlock(x+i, y+2, z, ModBlocks.BlockFlag, 2, 0);
		//}
		//This is a test comment to see if I sync with github for windows
		if(world.isAirBlock(x, y+3, z)) {
			world.setBlock(x, y+3, z, ModBlocks.BlockFlag, 2, 0);
		}
		
		return true;
	}
}
