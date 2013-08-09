package kkaylium.mod.RandomUtilities.main;

import kkaylium.mod.RandomUtilities.mobs.EntitySnowSlime;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = "RandomUtilities", name = "Random Utilities", version = "0.0.0.001")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class RandomUtilities {
	
	//The instance of your mod that Forge uses.
	@Instance ("RandomUtilities")
	public static RandomUtilities instance;
	
	//Says where the client and server proxy code is loaded.
	@SidedProxy(clientSide="kkaylium.mod.RandomUtilities.main.ClientProxy", serverSide="kkaylium.mod.RandomUtilities.main.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new RandomUtilitiesWorldGen());
	}
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
		BlockRegistry.BlockInit();
		ItemRegistry.ItemInit();
		RecipeRegistry.RecipeInit();
		
		EntityRegistry.registerModEntity(EntitySnowSlime.class, "SnowSlime", EntityRegistry.findGlobalUniqueEntityId(), this, 60, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.SnowSlime.name", "en_US", "Snow Slime");
		EntityRegistry.addSpawn(EntitySnowSlime.class, 10, 1, 2, EnumCreatureType.monster);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
