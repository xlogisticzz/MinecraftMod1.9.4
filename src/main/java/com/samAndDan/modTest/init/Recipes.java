package com.samAndDan.modTest.init;

import com.samAndDan.modTest.block.ModBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void initVanilla() {

        GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.rubyBlock, "gemRuby", "gemRuby", "gemRuby", "gemRuby", "gemRuby", "gemRuby", "gemRuby", "gemRuby", "gemRuby"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.titaniumBlock, "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium", "ingotTitanium"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.copperBlock, "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper", "ingotCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(ModBlocks.tinBlock, "ingotTin", "ingotTin", "ingotTin", "ingotTin", "ingotTin", "ingotTin", "ingotTin", "ingotTin", "ingotTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ruby, 9), "blockRuby"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.titaniumIngot, 9), "blockTitanium"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.copperIngot, 9), "blockCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.tinIngot, 9), "blockTin"));

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyAxe, "RR ", "RS ", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyAxe, " RR", " SR", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyHoe, "RR ", " S ", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyHoe, " RR", " S ", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubyPick, "RRR", " S ", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubySpade, " R ", " S ", " S ", 'R', "gemRuby", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.rubySword, " R ", " R ", " S ", 'R', "gemRuby", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumAxe, "TT ", "TS ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumAxe, " TT", " ST", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumHoe, "TT ", " S ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumHoe, " TT", " S ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumPick, "TTT", " S ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumSpade, " T ", " S ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.titaniumSword, " T ", " T ", " S ", 'T', "ingotTitanium", 'S', "stickWood"));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumSlab, 3), "TTT", "   ", "   ", 'T', "blockTitanium");
        GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumSlab, 3), "   ", "TTT", "   ", 'T', "blockTitianium");
        GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumSlab, 3), "   ", "   ", "TTT",  'T', "blockTitanium");

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperAxe, "CC ", "CS ", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperAxe, "CC ", " SC", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperHoe, "CC ", " S ", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperHoe, " CC", " S ", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperPick, "CCC", " S ", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperSpade, " C ", " S ", " S ", 'C', "ingotCopper", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.copperSword, " C ", " C ", " S ", 'C', "ingotCopper", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinAxe, "TT ", "TS ", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinAxe, "TT ", " ST", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinHoe, "TT ", " S ", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinHoe, " TT", " S ", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinPick, "TTT", " S ", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinSpade, " T ", " S ", " S ", 'T', "ingotTin", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.tinSword, " T ", " T ", " S ", 'T', "ingotTin", 'S', "stickWood"));

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1, 0), 5F);
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1, 0), 2F);
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot, 1, 0), 2F);
    }

    public static void initOreDictionary() {
        OreDictionary.registerOre("gemRuby", ModItems.ruby);
        OreDictionary.registerOre("oreRuby", ModBlocks.rubyOre);
        OreDictionary.registerOre("blockRuby", ModBlocks.rubyBlock);

        OreDictionary.registerOre("ingotTitanium", ModItems.titaniumIngot);
        OreDictionary.registerOre("oreTitanium", ModBlocks.titaniumOre);
        OreDictionary.registerOre("blockTitanium", ModBlocks.titaniumBlock);

        OreDictionary.registerOre("ingotCopper", ModItems.copperIngot);
        OreDictionary.registerOre("oreCopper", ModBlocks.copperOre);
        OreDictionary.registerOre("blockCopper", ModBlocks.copperBlock);

        OreDictionary.registerOre("ingotTin", ModItems.tinIngot);
        OreDictionary.registerOre("oreTin", ModBlocks.tinOre);
        OreDictionary.registerOre("blockTin", ModBlocks.tinBlock);

    }
}
