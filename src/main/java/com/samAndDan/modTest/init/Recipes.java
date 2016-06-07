package com.samAndDan.modTest.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void initVanilla() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9, 0), new ItemStack(ModBlocks.rubyBlock, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock, 1, 0), "rrr", "rrr", "rrr", 'r', new ItemStack(ModItems.ruby));

    }
}
