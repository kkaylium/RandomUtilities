package kkaylium.mod.RandomUtilities.main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import kkaylium.mod.RandomUtilities.block.*;

public class BlockRegistry {
	
	
	public final static Block CrystalOre = new CrystalOre(1000, Material.rock).func_111022_d("randomutilities:crystalOre");
	
	public final static Block CrystalBlock = new CrystalBlock(1001, Material.rock).func_111022_d("randomutilities:crystalBlock");

	public final static Block CrystalGlass = new CrystalGlass(1002, Material.glass, false).func_111022_d("randomutilities:crystalGlass");
	
	public final static Block FireCrystalOre = new FireCrystalOre(1003, Material.rock).func_111022_d("randomutilities:fireCrystalOre");
	
	public final static Block FireCrystalBlock = new FireCrystalBlock(1004, Material.rock).func_111022_d("randomutilities:fireCrystalBlock");
	
	public final static Block FireCrystalGlass = new FireCrystalGlass(1005, Material.glass).func_111022_d("randomutilities:fireCrystalGlass");
	public static void BlockInit(){
		GameRegistry.registerBlock(CrystalOre, "CrystalOre");
		MinecraftForge.setBlockHarvestLevel(CrystalOre, "pickaxe", 1);
		GameRegistry.registerBlock(CrystalBlock, "CrystalBlock");
		GameRegistry.registerBlock(CrystalGlass, "CrystalGlass");
		GameRegistry.registerBlock(FireCrystalOre, "FireCrystalOre");
		MinecraftForge.setBlockHarvestLevel(FireCrystalOre, "pickaxe", 1);
		GameRegistry.registerBlock(FireCrystalBlock, "FireCrystalBlock");
		GameRegistry.registerBlock(FireCrystalGlass, "FireCrystalGlass");
		LanguageRegistry.addName(CrystalOre, "Crystal Ore");
		LanguageRegistry.addName(CrystalBlock, "Crystal Block");
		LanguageRegistry.addName(CrystalGlass, "Crystal Glass");
		LanguageRegistry.addName(FireCrystalOre, "Fire Crystal Ore");
		LanguageRegistry.addName(FireCrystalBlock, "Fire Crystal Block");
		LanguageRegistry.addName(FireCrystalGlass, "FireCrystalGlass");
	}
}
