package com.samAndDan.modTest.init;

import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class InventoryRender {

    public static void initInventoryRender() {
        //ingots etc
        InventoryItemRender(ModItems.ruby);
        InventoryItemRender(ModItems.titaniumIngot);
        InventoryItemRender(ModItems.copperIngot);
        InventoryItemRender(ModItems.tinIngot);
        //axes
        InventoryItemRender(ModItems.rubyAxe);
        InventoryItemRender(ModItems.titaniumAxe);
        InventoryItemRender(ModItems.copperAxe);
        InventoryItemRender(ModItems.tinAxe);
        //swords
        InventoryItemRender(ModItems.rubySword);
        InventoryItemRender(ModItems.titaniumSword);
        InventoryItemRender(ModItems.copperSword);
        InventoryItemRender(ModItems.tinSword);
        //hoes
        InventoryItemRender(ModItems.rubyHoe);
        InventoryItemRender(ModItems.titaniumHoe);
        InventoryItemRender(ModItems.copperHoe);
        InventoryItemRender(ModItems.tinHoe);
        //picks
        InventoryItemRender(ModItems.rubyPick);
        InventoryItemRender(ModItems.titaniumPick);
        InventoryItemRender(ModItems.copperPick);
        InventoryItemRender(ModItems.tinPick);
        //spades
        InventoryItemRender(ModItems.rubySpade);
        InventoryItemRender(ModItems.titaniumSpade);
        InventoryItemRender(ModItems.copperSpade);
        InventoryItemRender(ModItems.tinSpade);
        //ores
        InventoryBlockRender(ModBlocks.rubyOre);
        InventoryBlockRender(ModBlocks.titaniumOre);
        InventoryBlockRender(ModBlocks.copperOre);
        InventoryBlockRender(ModBlocks.tinOre);
        //blocks
        InventoryBlockRender(ModBlocks.rubyBlock);
        InventoryBlockRender(ModBlocks.titaniumBlock);
        InventoryBlockRender(ModBlocks.copperBlock);
        InventoryBlockRender(ModBlocks.tinBlock);
        //slabs
        InventoryBlockRender(ModBlocks.titaniumSlab);
        InventoryBlockRender(ModBlocks.copperSlab);
        InventoryBlockRender(ModBlocks.tinSlab);
        InventoryBlockRender(ModBlocks.rubySlab);
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
            ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(StringUtils.getUnwrappedUnlocalizedName(item.getUnlocalizedName()) + i, "inventory"));
        }
    }


}
