package com.samAndDan.modTest.proxies;

import com.samAndDan.modTest.config.ModConfiguration;
import com.samAndDan.modTest.init.InventoryRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModConfiguration.clientPreInit();
        InventoryRender.initModelBakery();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        InventoryRender.initInventoryRender();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

}
