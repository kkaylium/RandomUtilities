package kkaylium.mod.RandomUtilities.main;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RandomUtilitiesWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1: 
			generateEnd();
			break;
		}
	}
	
	public void generateOverworld(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 30; i++)
		{
			int oreX = chunkX + random.nextInt(16);
			int oreY = random.nextInt(64);
			int oreZ = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(BlockRegistry.CrystalOre.blockID, 10)).generate(world, random, oreX, oreY, oreZ);
		}
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 30; i++)
		{
			int oreX = chunkX + random.nextInt(16);
			int oreY = random.nextInt(100);
			int oreZ = chunkZ + random.nextInt(16);
			
			(new NetherGenMinable(BlockRegistry.FireCrystalOre.blockID, 10)).generate(world, random, oreX, oreY, oreZ);
		}
	}
	public void generateEnd()
	{
	
	}
	
	

}
