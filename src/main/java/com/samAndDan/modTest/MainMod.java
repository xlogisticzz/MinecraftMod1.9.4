package com.samAndDan.modTest;

import com.samAndDan.modTest.config.ModConfiguration;
import com.samAndDan.modTest.gui.GuiChestHandler;
import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.init.ModItems;
import com.samAndDan.modTest.init.Recipes;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.proxies.CommonProxy;
import com.samAndDan.modTest.utils.LogHelper;
import com.samAndDan.modTest.world.GuiHandlerRegistry;
import com.samAndDan.modTest.world.WorldGenerationHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(name = Strings.NAME, modid = Strings.MODID, version = Strings.VERSION, guiFactory = Strings.GUI_FACTORY)
public class MainMod {

    @Mod.Instance(Strings.MODID)
    public static MainMod instance;

    @SidedProxy(clientSide = Strings.CLIENT_PROXY, serverSide = Strings.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModConfiguration.preInit();
        proxy.preInit(event);
        ModItems.createItems();
        ModBlocks.createBlocks();
        Recipes.initOreDictionary();
        Recipes.initVanilla();

        NetworkRegistry.INSTANCE.registerGuiHandler(instance, GuiHandlerRegistry.getInstance());
        GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiChestHandler(), GuiChestHandler.getGuiID());


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        new WorldGenerationHandler();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.info("Test Mod loaded");

    }
}
