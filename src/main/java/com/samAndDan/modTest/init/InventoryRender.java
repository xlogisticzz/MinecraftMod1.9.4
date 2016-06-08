package com.samAndDan.modTest.init;

import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class InventoryRender {

    public static void initInventoryRender() {

        InventoryItemRender(ModItems.ruby);
        InventoryItemRender(ModItems.titaniumIngot);
        InventoryItemRender(ModItems.rubyAxe);
        InventoryItemRender(ModItems.titaniumAxe);
        InventoryItemRender(ModItems.rubySword);
        InventoryItemRender(ModItems.titaniumSword);
        InventoryItemRender(ModItems.rubyHoe);
        InventoryItemRender(ModItems.titaniumHoe);
        InventoryItemRender(ModItems.rubyPick);
        InventoryItemRender(ModItems.titaniumPick);
        InventoryItemRender(ModItems.rubySpade);
        InventoryItemRender(ModItems.titaniumSpade);

        InventoryBlockRender(ModBlocks.rubyOre);
        InventoryBlockRender(ModBlocks.titaniumOre);
        InventoryBlockRender(ModBlocks.rubyBlock);
        InventoryBlockRender(ModBlocks.titaniumBlock);

    }


    public static void initModelBakery() {

    }

    public static void RegisterToModelBakery(Item item, int maxMeta) {
        for (int i = 0; i <= maxMeta; i++) {
            //ModelBakery.addVariantName(item, StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()) + i);
        }
    }

    public static void InventoryBlockRender(Block block) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(block.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()), "inventory"));
    }

    public static void InventoryItemRenderWithMeta(Item item, int maxMeta) {
        for (int i = 0; i <= maxMeta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()) + i, "inventory"));
        }
    }


}
