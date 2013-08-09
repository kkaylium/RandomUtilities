package kkaylium.mod.RandomUtilities.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class CrystalBlock extends RandomUtilitiesBlock{

	public CrystalBlock(int id, Material material) {
		super(id, material);
		this.setUnlocalizedName("crystalBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.5F);
		this.setStepSound(Block.soundGlassFootstep);
		
	}

}
