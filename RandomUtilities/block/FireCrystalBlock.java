package kkaylium.mod.RandomUtilities.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class FireCrystalBlock extends RandomUtilitiesBlock{

	public FireCrystalBlock(int id, Material material) {
		super(id, material);
		this.setHardness(4.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("firecrystalblock");
	}
	

}
