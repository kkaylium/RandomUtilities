package kkaylium.mod.RandomUtilities.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import kkaylium.mod.RandomUtilities.main.RandomUtilitiesBlock;

public class FireCrystalGlass extends RandomUtilitiesBlock{

	public FireCrystalGlass(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(0.3F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightValue(1.0F);
		this.setUnlocalizedName("firecrystalglass");
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
