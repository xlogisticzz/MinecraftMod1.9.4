package com.samAndDan.modTest.init;

import com.samAndDan.modTest.item.ItemBasicItem;
import com.samAndDan.modTest.item.ItemModAxe;
import com.samAndDan.modTest.item.ItemModSword;
import com.samAndDan.modTest.item.ModItem;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.lib.Values;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ModItem ruby;
    public static ModItem titaniumIngot;
    public static ItemModAxe rubyAxe;
    public static ItemModAxe titaniumAxe;
    public static ItemModSword rubySword;
    public static ItemModSword titaniumSword;


    public static Item.ToolMaterial materialRuby = EnumHelper.addToolMaterial("ruby", 3, Values.RUBY_DURABILITY, 4.1F, 7.5F, 40);
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("titanium", 4, Values.TITANIUM_DURABILITY, 4.6F, 8.5F, 30);

    public static void createItems() {
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBYAXE, Values.RUBY_SPEED);
        titaniumAxe = new ItemModAxe(materialTitanium, Strings.TITANIUMAXE, Values.TITANIUM_SPEED);
        rubySword = new ItemModSword(materialRuby, Strings.RUBYSWORD);
        titaniumSword = new ItemModSword(materialTitanium, Strings.TITANIUMSWORD);


        GameRegistry.register(ruby);
        GameRegistry.register(titaniumIngot);
        GameRegistry.register(rubyAxe);
        GameRegistry.register(titaniumAxe);
        GameRegistry.register(rubySword);
        GameRegistry.register(titaniumSword);

    }

}
