package com.samAndDan.modTest.init;

import com.samAndDan.modTest.block.*;
import com.samAndDan.modTest.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static ModBlock rubyOre;
    public static ModBlock titaniumOre;
    public static ModBlock copperOre;
    public static ModBlock tinOre;
    public static ModBlock rubyBlock;
    public static ModBlock titaniumBlock;
    public static ModBlock copperBlock;
    public static ModBlock tinBlock;
    public static ModBlockSlab titaniumSlab;
    public static ModBlockSlab titaniumDoubleSlab;
    public static ModBlockSlab copperSlab;
    public static ModBlockSlab copperDoubleSlab;
    public static ModBlockSlab tinSlab;
    public static ModBlockSlab tinDoubleSlab;
    public static ModBlockSlab rubySlab;
    public static ModBlockSlab rubyDoubleSlab;




    public static void createBlocks() {
        rubyOre = new BlockModOre(Strings.RUBY_ORE, 3F, 5F);
        titaniumOre = new BlockModOre(Strings.TITANIUM_ORE, 4F, 5F);
        copperOre = new BlockModOre(Strings.COPPER_ORE, 2F, 5F);
        tinOre = new BlockModOre(Strings.TIN_ORE, 3F, 5F);
        rubyBlock = new BlockBasicBlock(Material.IRON, Strings.RUBY_BLOCK, 3F, 5F);
        titaniumBlock = new BlockBasicBlock(Material.IRON, Strings.TITANIUM_BLOCK, 5F, 7F);
        copperBlock = new BlockBasicBlock(Material.IRON, Strings.COPPER_BLOCK, 2F, 5F);
        tinBlock = new BlockBasicBlock(Material.IRON, Strings.TIN_BLOCK, 3F, 5F);

        titaniumSlab = new BlockTitaniumSlab.Half();
        titaniumDoubleSlab = new BlockTitaniumSlab.Double();
        copperSlab = new BlockCopperSlab.Half();
        copperDoubleSlab = new BlockCopperSlab.Double();
        tinSlab = new BlockTinSlab.Half();
        tinDoubleSlab = new BlockTinSlab.Double();
        rubySlab = new BlockRubySlab.Half();
        rubyDoubleSlab = new BlockRubySlab.Double();



        registerBlock(rubyOre);
        registerBlock(titaniumOre);
        registerBlock(copperOre);
        registerBlock(tinOre);
        registerBlock(rubyBlock);
        registerBlock(titaniumBlock);
        registerBlock(copperBlock);
        registerBlock(tinBlock);
        registerBlockWithItem(titaniumSlab, new ItemSlab(titaniumSlab, titaniumSlab, titaniumDoubleSlab));
        registerBlock(titaniumDoubleSlab);
        registerBlockWithItem(copperSlab, new ItemSlab(copperSlab, copperSlab, copperDoubleSlab));
        registerBlock(copperDoubleSlab);
        registerBlockWithItem(tinSlab, new ItemSlab(tinSlab, tinSlab, tinDoubleSlab));
        registerBlock(tinDoubleSlab);
        registerBlockWithItem(rubySlab, new ItemSlab(rubySlab, rubySlab, rubyDoubleSlab));
        registerBlock(rubyDoubleSlab);


    }

    private static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

    }

    private static void registerBlockWithItem(Block block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));

    }


}
