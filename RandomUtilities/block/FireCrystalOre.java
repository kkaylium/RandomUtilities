package kkaylium.mod.RandomUtilities.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.mod.RandomUtilities.main.ItemRegistry;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class FireCrystalOre extends RandomUtilitiesBlock{

	public FireCrystalOre(int id, Material material) {
		super(id, material);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("firecrystalore");
	}
	public int idDropped(int par1, Random random, int zero)
	{
		return(ItemRegistry.FireCrystal.itemID);
	}
	public int quantityDropped(Random par1Random)
    {
        return 5;
    }
}
