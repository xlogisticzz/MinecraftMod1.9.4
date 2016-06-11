package com.samAndDan.modTest.block;

import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class ModBlockSlab extends BlockSlab {
    public static final PropertyEnum<ModBlockSlab.Variant> VARIANT = PropertyEnum.<ModBlockSlab.Variant>create("variant", ModBlockSlab.Variant.class);

    public ModBlockSlab(Material m) {
        super(m);
        IBlockState iblockstate = this.blockState.getBaseState();

        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(iblockstate.withProperty(VARIANT, ModBlockSlab.Variant.DEFAULT));
    }




    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, ModBlockSlab.Variant.DEFAULT);

        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP) {
            i |= 8;
        }

        return i;
    }

    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[]{VARIANT}) : new BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    public String getUnlocalizedName(int meta) {
        return getUnlocalizedName();
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Strings.MODID.toLowerCase() + ":", StringUtils.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    public Comparable<?> getTypeForItem(ItemStack stack) {
        return ModBlockSlab.Variant.DEFAULT;
    }



    public static enum Variant implements IStringSerializable {
        DEFAULT;

        public String getName() {
            return "default";
        }
    }

}