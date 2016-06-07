package com.samAndDan.modTest.init;

import com.samAndDan.modTest.item.ItemBasicItem;
import com.samAndDan.modTest.item.ModItem;
import com.samAndDan.modTest.lib.Strings;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ModItem ruby;


    public static void createItems() {
        ruby = new ItemBasicItem(Strings.RUBY);


        GameRegistry.registerItem(ruby, Strings.RUBY);
        //  GameRegistry.register(ruby, new ResourceLocation(Strings.MODID,Strings.RUBY ));

    }

}
