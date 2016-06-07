package com.samAndDan.modTest.block;


import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlock extends Block {
    public ModBlock(Material materialIn) {
        super(materialIn);
        setCreativeTab(ModCreativeTab.tabMod);
    }

    public ModBlock() {
        this(Material.ROCK);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Strings.MODID.toLowerCase() + ":", StringUtils.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


}
