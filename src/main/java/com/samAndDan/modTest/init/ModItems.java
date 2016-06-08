package com.samAndDan.modTest.init;

import com.samAndDan.modTest.item.*;
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
    public static ItemModHoe rubyHoe;
    public static ItemModHoe titaniumHoe;
    public static ItemModPick rubyPick;
    public static ItemModPick titaniumPick;
    public static ItemModSpade rubySpade;
    public static ItemModSpade titaniumSpade;

    public static Item.ToolMaterial materialRuby = EnumHelper.addToolMaterial("ruby", 3, Values.RUBY_DURABILITY, 5.5F, 7.5F, 40);
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("titanium", 4, Values.TITANIUM_DURABILITY, 6.1F, 8.5F, 30);

    public static void createItems() {
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBYAXE, Values.RUBY_SPEED);
        titaniumAxe = new ItemModAxe(materialTitanium, Strings.TITANIUMAXE, Values.TITANIUM_SPEED);
        rubySword = new ItemModSword(materialRuby, Strings.RUBYSWORD);
        titaniumSword = new ItemModSword(materialTitanium, Strings.TITANIUMSWORD);
        rubyHoe = new ItemModHoe(materialRuby, Strings.RUBYHOE);
        titaniumHoe = new ItemModHoe(materialTitanium, Strings.TITANIUMHOE);
        rubyPick = new ItemModPick(materialRuby, Strings.RUBYPICKAXE);
        titaniumPick = new ItemModPick(materialTitanium, Strings.TITANIUMPICKAXE);
        rubySpade = new ItemModSpade(materialRuby, Strings.RUBYSPADE);
        titaniumSpade = new ItemModSpade(materialTitanium, Strings.TITANIUMSPADE);



        GameRegistry.register(ruby);
        GameRegistry.register(titaniumIngot);
        GameRegistry.register(rubyAxe);
        GameRegistry.register(titaniumAxe);
        GameRegistry.register(rubySword);
        GameRegistry.register(titaniumSword);
        GameRegistry.register(rubyHoe);
        GameRegistry.register(titaniumHoe);
        GameRegistry.register(rubyPick);
        GameRegistry.register(titaniumPick);
        GameRegistry.register(rubySpade);
        GameRegistry.register(titaniumSpade);

    }

}
