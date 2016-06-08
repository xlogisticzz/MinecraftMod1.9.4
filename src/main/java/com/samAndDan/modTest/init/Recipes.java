package com.samAndDan.modTest.init;

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
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ruby, 9), "blockRuby"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.titaniumIngot, 9), "blockTitanium"));

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

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1, 0), 5F);
    }

    public static void initOreDictonary() {
        OreDictionary.registerOre("gemRuby", ModItems.ruby);
        OreDictionary.registerOre("oreRuby", ModBlocks.rubyOre);
        OreDictionary.registerOre("blockRuby", ModBlocks.rubyBlock);

        OreDictionary.registerOre("ingotTitanium", ModItems.titaniumIngot);
        OreDictionary.registerOre("oreTitanium", ModBlocks.titaniumOre);
        OreDictionary.registerOre("blockTitanium", ModBlocks.titaniumBlock);

    }
}
