package com.samAndDan.modTest.init;

import com.samAndDan.modTest.block.BlockBasicBlock;
import com.samAndDan.modTest.block.BlockModOre;
import com.samAndDan.modTest.block.ModBlock;
import com.samAndDan.modTest.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static ModBlock rubyOre;
    public static ModBlock rubyBlock;


    public static void createBlocks() {
        rubyOre = new BlockModOre(Strings.RUBYORE, 3F, 5F);
        rubyBlock = new BlockBasicBlock(Material.ROCK, Strings.RUBYBLOCK, 3F, 5F);

        registerBlock(rubyOre);
        registerBlock(rubyBlock);

    }

    private static void registerBlock(ModBlock block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

    }


}
