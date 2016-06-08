package com.samAndDan.modTest.init;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void initVanilla() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9, 0), new ItemStack(ModBlocks.rubyBlock, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 9, 0), new ItemStack(ModBlocks.titaniumBlock, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock, 1, 0), "rrr", "rrr", "rrr", 'r', new ItemStack(ModItems.ruby));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.titaniumBlock, 1, 0), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.titaniumIngot));

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1, 0), 5F);


    }
}
