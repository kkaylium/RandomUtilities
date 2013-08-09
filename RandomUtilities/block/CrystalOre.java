package kkaylium.mod.RandomUtilities.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import kkaylium.mod.RandomUtilities.main.ItemRegistry;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class CrystalOre extends RandomUtilitiesBlock{

	public CrystalOre(int id, Material material) {
		super(id, material);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundStoneFootstep);
	    this.setUnlocalizedName("crystalOre");
	    this.setCreativeTab(CreativeTabs.tabBlock);
	    
	}
	public int idDropped(int par1, Random random, int zero)
	{
		return(ItemRegistry.Crystal.itemID);
	}
	public int quantityDropped(Random par1Random)
    {
        return 5;
    }
}
