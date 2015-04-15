package com.dudebro.dudeboot.world.gen;

import java.util.Random;

import com.dudebro.dudeboot.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFlag implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		world.setBlock(chunkX*16, 30, chunkZ*16, ModBlocks.BlockFlag, 0, 2);
	}

}
