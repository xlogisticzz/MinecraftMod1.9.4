package com.samAndDan.modTest.item;

import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item {


    public ModItem() {
        super();
        setCreativeTab(ModCreativeTab.tabMod);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", StringUtils.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", StringUtils.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}
