package com.samAndDan.modTest.item;

import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.lib.Strings;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemModAxe extends ItemAxe {

    public ItemModAxe(ToolMaterial material, String name, Float speed) {
        super(material, material.getDamageVsEntity(), speed);
        setCreativeTab(ModCreativeTab.tabMod);
        setUnlocalizedName(name);
        setMaxStackSize(1);
        setRegistryName(Strings.MODID, name);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
