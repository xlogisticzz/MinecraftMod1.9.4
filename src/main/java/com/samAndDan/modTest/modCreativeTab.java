package com.samAndDan.modTest;

import com.samAndDan.modTest.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTab {

    public static CreativeTabs tabMod = new CreativeTabs("tabMod") {
        @Override
        public Item getTabIconItem() {
            return ModItems.ruby;
        }
    };
}