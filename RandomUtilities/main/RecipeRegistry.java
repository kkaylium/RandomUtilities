package kkaylium.mod.RandomUtilities.main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegistry {
	
	
	public static void RecipeInit(){
		
		//Blocks Of Items
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CrystalBlock, 1), "***", "***", "***", '*', ItemRegistry.Crystal);
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.FireCrystalBlock, 1), "***", "***", "***", '*', ItemRegistry.FireCrystal);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.Crystal, 9), "#", '#', BlockRegistry.CrystalBlock);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.FireCrystal, 9), "#", '#', BlockRegistry.FireCrystalBlock);
		
		//Other Blocks
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.CrystalGlass, 4), "#*#", "*@*", "#*#", '#', Block.glass, '*', ItemRegistry.Crystal, '@', Item.glowstone);
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.FireCrystalGlass, 4), "#*#", "*@*", "#*#", '#', BlockRegistry.CrystalGlass, '*', ItemRegistry.FireCrystal, '@', Item.glowstone);		
		//Vanilla Non-Craftable Items
		GameRegistry.addRecipe(new ItemStack(Item.saddle, 1), "&&&", " @ ", " # ", '&', Item.leather, '@', Item.silk, '#', Item.ingotIron);
		GameRegistry.addRecipe(new ItemStack(Item.field_111212_ci, 1), "#@", '#', Item.ingotIron, '@', Item.silk);
	}

}
