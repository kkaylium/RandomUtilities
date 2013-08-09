package kkaylium.mod.RandomUtilities.main;

import kkaylium.mod.RandomUtilities.mobs.EntitySnowSlime;
import kkaylium.mod.RandomUtilities.mobs.ModelSnowSlime;
import kkaylium.mod.RandomUtilities.mobs.RenderSnowSlime;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	public void registerRenderers() {
        //Stuff Here Later!
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySnowSlime.class, new RenderSnowSlime(new ModelSnowSlime(1), new ModelSnowSlime(2), 0.5F)); // your render class
		EntityRegistry.registerGlobalEntityID(EntitySnowSlime.class, "SnowSlime", EntityRegistry.findGlobalUniqueEntityId(), 32324, 2243);
		
	}

}
