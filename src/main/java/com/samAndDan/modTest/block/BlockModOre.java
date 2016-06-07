package com.samAndDan.modTest.block;


import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockModOre extends ModBlock {

    public BlockModOre(String name, float hardness, float resistance) {
        setCreativeTab(ModCreativeTab.tabMod);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(SoundType.STONE);
        setUnlocalizedName(name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (this == ModBlocks.rubyOre) {
            return ModItems.ruby;
        }
        return super.getItemDropped(state, rand, fortune);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        if (this == ModBlocks.rubyOre) {
            return 2 + random.nextInt(3);
        }
        return super.quantityDropped(state, fortune, random);
    }
}