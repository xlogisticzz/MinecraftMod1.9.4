package com.samAndDan.modTest.init;

import com.samAndDan.modTest.ModCreativeTab;
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
        rubyOre = new BlockModOre(Strings.RUBYORE, 3F, 5F);
        titaniumOre = new BlockModOre(Strings.TITANIUMORE, 4F, 5F);
        copperOre = new BlockModOre(Strings.COPPERORE, 2F, 5F);
        tinOre = new BlockModOre(Strings.TINORE, 3F, 5F);
        rubyBlock = new BlockBasicBlock(Material.IRON, Strings.RUBYBLOCK, 3F, 5F);
        titaniumBlock = new BlockBasicBlock(Material.IRON, Strings.TITANIUMBLOCK, 5F, 7F);
        copperBlock = new BlockBasicBlock(Material.IRON, Strings.COPPERBLOCK, 2F, 5F);
        tinBlock = new BlockBasicBlock(Material.IRON, Strings.TINBLOCK, 3F, 5F);

        titaniumSlab = (ModBlockSlab) (new BlockTitaniumSlab.Half()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.TITANIUMSLAB).setRegistryName(Strings.MODID, Strings.TITANIUMSLAB).setCreativeTab(ModCreativeTab.tabMod);
        titaniumDoubleSlab = (ModBlockSlab) (new BlockTitaniumSlab.Double()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.TITANIUMSLABUPPER).setRegistryName(Strings.MODID, Strings.TITANIUMSLABUPPER);
        copperSlab = (ModBlockSlab) (new BlockCopperSlab.Half()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.COPPERSLAB).setRegistryName(Strings.MODID, Strings.COPPERSLAB).setCreativeTab(ModCreativeTab.tabMod);
        copperDoubleSlab = (ModBlockSlab) (new BlockCopperSlab.Double()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.COPPERSLABUPPER).setRegistryName(Strings.MODID, Strings.COPPERSLABUPPER);
        tinSlab = (ModBlockSlab) (new BlockTinSlab.Half()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.TINSLAB).setRegistryName(Strings.MODID, Strings.TINSLAB).setCreativeTab(ModCreativeTab.tabMod);
        tinDoubleSlab = (ModBlockSlab) (new BlockTinSlab.Double()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.TINSLABUPPER).setRegistryName(Strings.MODID, Strings.TINSLABUPPER);
        rubySlab = (ModBlockSlab) (new BlockRubySlab.Half()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.RUBYSLAB).setRegistryName(Strings.MODID, Strings.RUBYSLAB).setCreativeTab(ModCreativeTab.tabMod);
        rubyDoubleSlab = (ModBlockSlab) (new BlockRubySlab.Double()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName(Strings.RUBYSLABUPPER).setRegistryName(Strings.MODID, Strings.RUBYSLABUPPER);


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
