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
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("titanium", 4, ModConfiguration.titaniumDurability, 6.1F, 8.5F, 30);
    public static Item.ToolMaterial materialCopper = EnumHelper.addToolMaterial("copper", 3, ModConfiguration.copperDurability, 3F, 5F, 30);
    public static Item.ToolMaterial materialTin = EnumHelper.addToolMaterial("tin", 3, Values.TIN_DURABILITY, 3F, 5F, 30);

    public static void createItems() {
        //ingots etc
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUM_INGOT);
        copperIngot = new ItemBasicItem(Strings.COPPER_INGOT);
        tinIngot = new ItemBasicItem(Strings.TIN_INGOT);
        //axes
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBY_AXE, ModConfiguration.rubySpeed);
        titaniumAxe = new ItemModAxe(materialTitanium, Strings.TITANIUM_AXE, ModConfiguration.titaniumSpeed);
        copperAxe = new ItemModAxe(materialCopper, Strings.COPPER_AXE, ModConfiguration.copperSpeed);
        tinAxe = new ItemModAxe(materialTin, Strings.TIN_AXE, Values.TIN_SPEED);
        //swords
        rubySword = new ItemModSword(materialRuby, Strings.RUBY_SWORD);
        titaniumSword = new ItemModSword(materialTitanium, Strings.TITANIUM_SWORD);
        copperSword = new ItemModSword(materialCopper, Strings.COPPER_SWORD);
        tinSword = new ItemModSword(materialTin, Strings.TIN_SWORD);
        //hoes
        rubyHoe = new ItemModHoe(materialRuby, Strings.RUBY_HOE);
        titaniumHoe = new ItemModHoe(materialTitanium, Strings.TITANIUM_HOE);
        copperHoe = new ItemModHoe(materialCopper, Strings.COPPER_HOE);
        tinHoe = new ItemModHoe(materialTin, Strings.TIN_HOE);
        //picks
        rubyPick = new ItemModPick(materialRuby, Strings.RUBY_PICKAXE);
        titaniumPick = new ItemModPick(materialTitanium, Strings.TITANIUM_PICKAXE);
        copperPick = new ItemModPick(materialCopper, Strings.COPPER_PICKAXE);
        tinPick = new ItemModPick(materialTin, Strings.TIN_PICKAXE);
        //spades
        rubySpade = new ItemModSpade(materialRuby, Strings.RUBY_SPADE);
        titaniumSpade = new ItemModSpade(materialTitanium, Strings.TITANIUM_SPADE);
        copperSpade = new ItemModSpade(materialCopper, Strings.COPPER_SPADE);
        tinSpade = new ItemModSpade(materialTin, Strings.TIN_SPADE);

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
