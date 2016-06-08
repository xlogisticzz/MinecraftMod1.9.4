package com.samAndDan.modTest.init;

import com.samAndDan.modTest.item.ItemBasicItem;
import com.samAndDan.modTest.item.ModItem;
import com.samAndDan.modTest.lib.Strings;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ModItem ruby;
    public static ModItem titaniumIngot;



    public static void createItems() {
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);


        GameRegistry.register(ruby);
        GameRegistry.register(titaniumIngot);

    }

}
