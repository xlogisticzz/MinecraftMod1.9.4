package com.samAndDan.modTest;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ModCreativeTab {

    public static CreativeTabs tabMod = new CreativeTabs("tabMod") {
        @Override
        public Item getTabIconItem() {
            return Items.APPLE;
        }
    };
}