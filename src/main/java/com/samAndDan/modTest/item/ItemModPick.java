package com.samAndDan.modTest.item;

import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.lib.Strings;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemModPick extends ItemPickaxe {

    public ItemModPick(ToolMaterial material, String name) {
        super(material);
        setCreativeTab(ModCreativeTab.tabMod);
        setUnlocalizedName(name);
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
