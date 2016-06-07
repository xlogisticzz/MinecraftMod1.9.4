package com.samAndDan.modTest.init;

import com.samAndDan.modTest.block.BlockModOre;
import com.samAndDan.modTest.block.ModBlock;
import com.samAndDan.modTest.lib.Strings;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static ModBlock rubyOre;


    public static void createBlocks() {
        rubyOre = new BlockModOre(Strings.RUBYORE, 3F, 5F);
        GameRegistry.registerBlock(rubyOre, Strings.RUBYORE);

    }


}
