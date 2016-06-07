package com.samAndDan.modTest.block;


import com.samAndDan.modTest.ModCreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasicBlock extends ModBlock {

    public BlockBasicBlock(Material material, String name, float hardness, float resistance) {
        super(material);
        setCreativeTab(ModCreativeTab.tabMod);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.STONE);
        setUnlocalizedName(name);
    }
}
