package kkaylium.mod.RandomUtilities.main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import kkaylium.mod.RandomUtilities.item.*;

public class ItemRegistry {
	
	public final static Item Crystal = new Crystal(3000).func_111206_d("randomutilities:crystal");
	public final static Item FireCrystal = new FireCrystal(3001).func_111206_d("randomutilities:fireCrystal");
	
	public static void ItemInit()
	{
		GameRegistry.registerItem(Crystal, "Crystal");
		LanguageRegistry.addName(Crystal, "Crystal");
		GameRegistry.registerItem(FireCrystal, "FireCrystal");
		LanguageRegistry.addName(FireCrystal, "Fire Crystal");
	}
}
