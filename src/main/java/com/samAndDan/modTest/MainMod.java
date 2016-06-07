package com.samAndDan.modTest;

import com.samAndDan.modTest.init.ModBlocks;
import com.samAndDan.modTest.init.ModItems;
import com.samAndDan.modTest.init.Recipes;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.proxies.CommonProxy;
import com.samAndDan.modTest.utils.LogHelper;
import com.samAndDan.modTest.world.WorldGenerationHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Strings.NAME, modid = Strings.MODID, version = Strings.VERSION)
public class MainMod {

    @Mod.Instance(Strings.MODID)
    public static MainMod instance;

    @SidedProxy(clientSide = Strings.CLIENTPROXY, serverSide = Strings.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.createItems();
        ModBlocks.createBlocks();
        proxy.preInit(event);
        Recipes.initVanilla();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        new WorldGenerationHandler();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        LogHelper.info("Learning Modding loaded");

    }
}
