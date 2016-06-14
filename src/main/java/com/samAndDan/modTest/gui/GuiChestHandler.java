package com.samAndDan.modTest.gui;

import com.samAndDan.modTest.gui.container.ContainerModChest;
import com.samAndDan.modTest.tileEntities.TileEntityModChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiChestHandler implements IGuiHandler {

    private static final int GUI_ID_CHEST = 30;

    public static int getGuiID() {
        return GUI_ID_CHEST;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);
        if (tileEntity instanceof TileEntityModChest) {
            TileEntityModChest tileEntityInventoryBasic = (TileEntityModChest) tileEntity;
            return new ContainerModChest(player.inventory, tileEntityInventoryBasic);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        BlockPos xyz = new BlockPos(x, y, z);
        TileEntity tileEntity = world.getTileEntity(xyz);
        if (tileEntity instanceof TileEntityModChest) {
            TileEntityModChest tileEntityInventoryBasic = (TileEntityModChest) tileEntity;
            return new GuiModChest(player.inventory, tileEntityInventoryBasic);
        }
        return null;
    }
}
