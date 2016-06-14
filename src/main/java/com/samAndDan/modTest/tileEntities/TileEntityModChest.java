package com.samAndDan.modTest.tileEntities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

import javax.annotation.Nullable;
import java.util.Arrays;

public class TileEntityModChest extends TileEntity implements IInventory {

    private final int NUMBER_OF_SLOTS = 9;
    private ItemStack[] itemStacks = new ItemStack[NUMBER_OF_SLOTS];

    @Override
    public int getSizeInventory() {
        return itemStacks.length;
    }

    @Nullable
    @Override
    public ItemStack getStackInSlot(int index) {
        return itemStacks[index];
    }

    @Nullable
    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack itemStackInSlot = getStackInSlot(index);
        if (itemStackInSlot == null) {
            return null;
        }

        ItemStack itemStackRemoved;
        if (itemStackInSlot.stackSize <= count) {
            itemStackRemoved = itemStackInSlot;
            setInventorySlotContents(index, null);
        } else {
            itemStackRemoved = itemStackInSlot.splitStack(count);
            if (itemStackInSlot.stackSize == 0) {
                setInventorySlotContents(index, null);
            }
        }
        markDirty();
        return itemStackRemoved;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        itemStacks[index] = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
        markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        if (this.worldObj.getTileEntity(this.pos) != this) {
            return false;
        }
        final double X_CENTRE_OFFSET = 0.5;
        final double Y_CENTRE_OFFSET = 0.5;
        final double Z_CENTRE_OFFSET = 0.5;
        final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
        return player.getDistanceSq(pos.getX() + X_CENTRE_OFFSET, pos.getY() + Y_CENTRE_OFFSET, pos.getZ() + Z_CENTRE_OFFSET) < MAXIMUM_DISTANCE_SQ;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        NBTTagList dataForAllSlots = new NBTTagList();
        for (int i = 0; i < this.itemStacks.length; ++i) {
            if (this.itemStacks[i] != null) {
                NBTTagCompound slotData = new NBTTagCompound();
                slotData.setByte("Slot", (byte) i);
                this.itemStacks[i].writeToNBT(slotData);
                dataForAllSlots.appendTag(slotData);
            }
        }
        compound.setTag("Items", dataForAllSlots);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        final byte NBT_TYPE_COMPOUND = 10;
        NBTTagList dataForAllSlots = compound.getTagList("Items", NBT_TYPE_COMPOUND);
        Arrays.fill(itemStacks, null);
        for (int i = 0; i < dataForAllSlots.tagCount(); ++i) {
            NBTTagCompound slotData = dataForAllSlots.getCompoundTagAt(i);
            int slotIndex = slotData.getByte("Slot") & 255;

            if (slotIndex >= 0 && slotIndex < this.itemStacks.length) {
                this.itemStacks[slotIndex] = ItemStack.loadItemStackFromNBT(slotData);
            }
        }
    }

    @Override
    public void clear() {
        Arrays.fill(itemStacks, null);
    }

    @Override
    public String getName() {
        return "container.modTest.chest.name";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
    }


    @Override
    public ItemStack removeStackFromSlot(int slotIndex) {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null) setInventorySlotContents(slotIndex, null);
        return itemStack;
    }

    @Override
    public void openInventory(EntityPlayer player) {
    }

    @Override
    public void closeInventory(EntityPlayer player) {
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {
    }

    @Override
    public int getFieldCount() {
        return 0;
    }
}
