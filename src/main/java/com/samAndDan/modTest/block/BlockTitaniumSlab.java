package com.samAndDan.modTest.block;

import com.samAndDan.modTest.init.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Sam on 11/06/2016.
 */
public abstract class BlockTitaniumSlab extends ModBlockSlab {

    public BlockTitaniumSlab(){
        super(Material.ROCK);
        setHardness(2.0F);
        setResistance(10.0F);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModBlocks.titaniumSlab);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(ModBlocks.titaniumSlab);
    }

    public static class Double extends BlockTitaniumSlab {
        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockTitaniumSlab {
        public boolean isDouble() {
            return false;
        }
    }
}
