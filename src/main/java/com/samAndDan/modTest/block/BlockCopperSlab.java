package com.samAndDan.modTest.block;

import com.samAndDan.modTest.ModCreativeTab;
import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class BlockCopperSlab extends ModBlockSlab {

    public BlockCopperSlab(){
        super(Material.ROCK);
        setHardness(2.0F);
        setResistance(10.0F);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModBlocks.copperSlab);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(ModBlocks.copperSlab);
    }

    public static class Double extends BlockCopperSlab {
        public Double() {
            setUnlocalizedName(Strings.COPPER_SLAB_DOUBLE);
            setRegistryName(Strings.MODID, Strings.COPPER_SLAB_DOUBLE);
        }

        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockCopperSlab {
        public Half() {
            setUnlocalizedName(Strings.COPPER_SLAB);
            setRegistryName(Strings.MODID, Strings.COPPER_SLAB);
            setCreativeTab(ModCreativeTab.tabMod);
        }

        public boolean isDouble() {
            return false;
        }
    }
}
