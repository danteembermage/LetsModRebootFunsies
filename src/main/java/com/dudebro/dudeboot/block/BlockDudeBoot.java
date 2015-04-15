package com.dudebro.dudeboot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDudeBoot extends Block {

	public BlockDudeBoot(Material material){
		super(material);
	}
	
	public BlockDudeBoot(){
		this(Material.rock);
	}
}
