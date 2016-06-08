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
    public static ModBlock titaniumOre;
    public static ModBlock copperOre;
    public static ModBlock rubyBlock;
    public static ModBlock titaniumBlock;
    public static ModBlock copperBlock;


    public static void createBlocks() {
        rubyOre = new BlockModOre(Strings.RUBYORE, 3F, 5F);
        titaniumOre = new BlockModOre(Strings.TITANIUMORE, 4F, 5F);
        copperOre = new BlockModOre(Strings.COPPERORE, 2F, 5F);
        rubyBlock = new BlockBasicBlock(Material.IRON, Strings.RUBYBLOCK, 3F, 5F);
        titaniumBlock = new BlockBasicBlock(Material.IRON, Strings.TITANIUMBLOCK, 5F, 7F);
        copperBlock = new BlockBasicBlock(Material.IRON, Strings.COPPERBLOCK, 2F, 5F);
        registerBlock(rubyOre);
        registerBlock(titaniumOre);
        registerBlock(copperOre);
        registerBlock(rubyBlock);
        registerBlock(titaniumBlock);
        registerBlock(copperBlock);

    }

    private static void registerBlock(ModBlock block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

    }


}
