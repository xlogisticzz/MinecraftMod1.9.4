package com.samAndDan.modTest.item;

import com.samAndDan.modTest.lib.Strings;

public class ItemBasicItem extends ModItem {

    public ItemBasicItem(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(Strings.MODID, name);

    }
}
