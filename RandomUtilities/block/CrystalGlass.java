package kkaylium.mod.RandomUtilities.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class CrystalGlass extends RandomUtilitiesBlock{

	public CrystalGlass(int par1, Material par2Material, boolean par3) {
		super(par1, par2Material);
		this.setUnlocalizedName("crystalGlass");
		this.setHardness(0.3F);
		this.setStepSound(Block.soundGlassFootstep);
		this.setLightValue(1.0F);
	    this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@SideOnly(Side.CLIENT)
	
	 public int getRenderBlockPass()
    {
        return 0;
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }


    public boolean renderAsNormalBlock()
    {
        return false;
    }


}
