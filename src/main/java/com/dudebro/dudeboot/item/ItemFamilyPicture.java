package com.dudebro.dudeboot.item;

import com.dudebro.dudeboot.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;

public class ItemFamilyPicture extends ItemDudeBoot{

	public ItemFamilyPicture() {
		super();
		this.setUnlocalizedName("DudeBoot:familyPicture");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setTextureName(Reference.MOD_ID + ":familyPicture");
	}
}
