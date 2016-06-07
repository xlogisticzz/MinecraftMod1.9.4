package com.samAndDan.modTest.world;

import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.lib.Values;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class WorldGenerationHandler implements IWorldGenerator {

    private WorldGenerator rubyGen;

    public WorldGenerationHandler() {

        GameRegistry.registerWorldGenerator(this, 3);
        rubyGen = new WorldGenMinable(ModBlocks.rubyOre.getDefaultState(), Values.RUBY_WORLD_GEN_AMOUNT);
    }

    public void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY) {

        for (int i = 0; i < iterations; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = rand.nextInt(highestY - lowestY) + lowestY;
            int z = chunkZ * 16 + rand.nextInt(16);
            BlockPos pos = new BlockPos(x, y, z);
            gen.generate(world, rand, pos);

        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension()) {
            case -1:
                generateNether(world, random, chunkX, chunkZ);
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
        }
    }

    private void generateOverworld(World world, Random random, int chunkX, int chunkZ) {

        generateStandardOre(random, chunkX, chunkZ, world, Values.RUBY_WORLD_GEN_ITERATIONS, this.rubyGen, Values.RUBY_WORLD_GEN_LOWESTY, Values.RUBY_WORLD_GEN_HIGHESTY);

    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {

    }


}