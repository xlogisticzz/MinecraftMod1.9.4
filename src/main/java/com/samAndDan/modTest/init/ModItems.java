package com.samAndDan.modTest.init;

import com.samAndDan.modTest.config.ModConfiguration;
import com.samAndDan.modTest.item.*;
import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.lib.Values;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ModItem ruby;
    public static ModItem titaniumIngot;
    public static ModItem copperIngot;
    public static ModItem tinIngot;
    public static ItemModAxe rubyAxe;
    public static ItemModAxe titaniumAxe;
    public static ItemModAxe copperAxe;
    public static ItemModAxe tinAxe;
    public static ItemModSword rubySword;
    public static ItemModSword titaniumSword;
    public static ItemModSword copperSword;
    public static ItemModSword tinSword;
    public static ItemModHoe rubyHoe;
    public static ItemModHoe titaniumHoe;
    public static ItemModHoe copperHoe;
    public static ItemModHoe tinHoe;
    public static ItemModPick rubyPick;
    public static ItemModPick titaniumPick;
    public static ItemModPick copperPick;
    public static ItemModPick tinPick;
    public static ItemModSpade rubySpade;
    public static ItemModSpade titaniumSpade;
    public static ItemModSpade copperSpade;
    public static ItemModSpade tinSpade;

    public static Item.ToolMaterial materialRuby = EnumHelper.addToolMaterial("ruby", 3, ModConfiguration.rubyDurability, 5.5F, 7.5F, 40);
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("titanium", 4, Values.TITANIUM_DURABILITY, 6.1F, 8.5F, 30);
    public static Item.ToolMaterial materialCopper = EnumHelper.addToolMaterial("copper", 3, Values.COPPER_DURABILITY, 3F, 5F, 30);
    public static Item.ToolMaterial materialTin = EnumHelper.addToolMaterial("tin", 3, Values.TIN_DURABILITY, 3F, 5F, 30);

    public static void createItems() {
        //ingots etc
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        copperIngot = new ItemBasicItem(Strings.COPPERINGOT);
        tinIngot = new ItemBasicItem(Strings.TININGOT);
        //axes
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBYAXE, ModConfiguration.rubySpeed);
        titaniumAxe = new ItemModAxe(materialTitanium, Strings.TITANIUMAXE, Values.TITANIUM_SPEED);
        copperAxe = new ItemModAxe(materialCopper, Strings.COPPERAXE, Values.COPPER_SPEED);
        tinAxe = new ItemModAxe(materialTin, Strings.TINAXE, Values.TIN_SPEED);
        //swords
        rubySword = new ItemModSword(materialRuby, Strings.RUBYSWORD);
        titaniumSword = new ItemModSword(materialTitanium, Strings.TITANIUMSWORD);
        copperSword = new ItemModSword(materialCopper, Strings.COPPERSWORD);
        tinSword = new ItemModSword(materialTin, Strings.TINSWORD);
        //hoes
        rubyHoe = new ItemModHoe(materialRuby, Strings.RUBYHOE);
        titaniumHoe = new ItemModHoe(materialTitanium, Strings.TITANIUMHOE);
        copperHoe = new ItemModHoe(materialCopper, Strings.COPPERHOE);
        tinHoe = new ItemModHoe(materialTin, Strings.TINHOE);
        //picks
        rubyPick = new ItemModPick(materialRuby, Strings.RUBYPICKAXE);
        titaniumPick = new ItemModPick(materialTitanium, Strings.TITANIUMPICKAXE);
        copperPick = new ItemModPick(materialCopper, Strings.COPPERPICKAXE);
        tinPick = new ItemModPick(materialTin, Strings.TINPICKAXE);
        //spades
        rubySpade = new ItemModSpade(materialRuby, Strings.RUBYSPADE);
        titaniumSpade = new ItemModSpade(materialTitanium, Strings.TITANIUMSPADE);
        copperSpade = new ItemModSpade(materialCopper, Strings.COPPERSPADE);
        tinSpade = new ItemModSpade(materialTin, Strings.TINSPADE);

        //register items

        //ingots etc
        GameRegistry.register(ruby);
        GameRegistry.register(titaniumIngot);
        GameRegistry.register(copperIngot);
        GameRegistry.register(tinIngot);
        //axes
        GameRegistry.register(rubyAxe);
        GameRegistry.register(titaniumAxe);
        GameRegistry.register(copperAxe);
        GameRegistry.register(tinAxe);
        //swords
        GameRegistry.register(rubySword);
        GameRegistry.register(titaniumSword);
        GameRegistry.register(copperSword);
        GameRegistry.register(tinSword);
        //Hoes
        GameRegistry.register(rubyHoe);
        GameRegistry.register(titaniumHoe);
        GameRegistry.register(copperHoe);
        GameRegistry.register(tinHoe);
        //picks
        GameRegistry.register(rubyPick);
        GameRegistry.register(titaniumPick);
        GameRegistry.register(copperPick);
        GameRegistry.register(tinPick);
        //spades
        GameRegistry.register(rubySpade);
        GameRegistry.register(titaniumSpade);
        GameRegistry.register(copperSpade);
        GameRegistry.register(tinSpade);

    }

}
