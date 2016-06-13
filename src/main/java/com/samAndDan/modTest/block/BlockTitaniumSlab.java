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
        public Double() {
            setUnlocalizedName(Strings.TITANIUM_SLAB_DOUBLE);
            setRegistryName(Strings.MODID, Strings.TITANIUM_SLAB_DOUBLE);
        }

        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockTitaniumSlab {
        public Half() {
            setUnlocalizedName(Strings.TITANIUM_SLAB);
            setRegistryName(Strings.MODID, Strings.TITANIUM_SLAB);
            setCreativeTab(ModCreativeTab.tabMod);
        }

        public boolean isDouble() {
            return false;
        }
    }
}
