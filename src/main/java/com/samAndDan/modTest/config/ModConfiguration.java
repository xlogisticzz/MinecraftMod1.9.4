package com.samAndDan.modTest.config;

import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.lib.Values;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ModConfiguration {

    public static int rubyDurability;
    public static float rubySpeed;
    public static int titaniumDurability;
    public static float titaniumSpeed;
    public static int copperDurability;
    public static float copperSpeed;
    public static int rubyWorldGenAmount;
    public static int rubyWorldGenIterations;
    public static int rubyWorldGenLowestY;
    public static int rubyWoldGenHighestY;
    public static int titaniumWorldGenAmount;
    public static int titaniumWorldGenIterations;
    public static int titaniumWorldGenLowestY;
    public static int titaniumWoldGenHighestY;
    public static int copperWorldGenAmount;
    public static int copperWorldGenIterations;
    public static int copperWorldGenLowestY;
    public static int copperWoldGenHighestY;


    public static final String CATEGORY_NAME_GENERAL = "category_general";
    public static final String CATEGORY_NAME_WORLD = "category_world";
    public static final String CATEGORY_NAME_MATERIAL = "category_material";
    public static final String CATEGORY_NAME_OTHER = "category_other";

    public static void preInit() {

        File configFile = new File(Loader.instance().getConfigDir(), "TestMod.cfg");
        config = new Configuration(configFile);
        syncFromFile();
    }

    public static void clientPreInit() {
        FMLCommonHandler.instance().bus().register(new ConfigEventHandler());
    }

    public static Configuration getConfig() {
        return config;
    }

    public static void syncFromFile() {
        syncConfig(true, true);
    }

    public static void syncFromGUI() {
        syncConfig(false, true);
    }

    public static void syncFromFields() {
        syncConfig(false, false);
    }

    private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig) {
        if (loadConfigFromFile) {
            config.load();
        }

        Property propertyRubyDurability = config.get(CATEGORY_NAME_MATERIAL, "Ruby Durability", Values.RUBY_DURABILITY_DEFAULT,
                "Set the durability of Ruby tools. [" + Values.RUBY_DURABILITY_MIN + " ~ " + Values.RUBY_DURABILITY_MAX + "] Default: " + Values.RUBY_DURABILITY_DEFAULT, Values.RUBY_DURABILITY_MIN, Values.RUBY_DURABILITY_MAX);
        propertyRubyDurability.setLanguageKey("gui.modtest.propertyRubyDurability");

        Property propertyRubySpeed = config.get(CATEGORY_NAME_MATERIAL, "Ruby Speed", Values.RUBY_SPEED_DEFAUlT,
                "Set the speed of Ruby tools (negative). [" + Values.RUBY_SPEED_MIN + " ~ " + Values.RUBY_SPEED_MAX + "] Default: " + Values.RUBY_SPEED_DEFAUlT, Values.RUBY_SPEED_MIN, Values.RUBY_SPEED_MAX);
        propertyRubySpeed.setLanguageKey("gui.modtest.propertyRubySpeed").setRequiresMcRestart(true);

        Property propertyTitaniumDurability = config.get(CATEGORY_NAME_MATERIAL, "Titanium Durability", Values.TITANIUM_DURABILITY_DEFAULT,
                "Set the durability of Titanium tools. [" + Values.TITANIUM_DURABILITY_MIN + " ~ " + Values.TITANIUM_DURABILITY_MAX + "] Default: " + Values.TITANIUM_DURABILITY_DEFAULT, Values.TITANIUM_DURABILITY_MIN, Values.TITANIUM_DURABILITY_MAX);
        propertyTitaniumDurability.setLanguageKey("gui.modtest.propertyTitaniumDurability");

        Property propertyTitaniumSpeed = config.get(CATEGORY_NAME_MATERIAL, "Titanium Speed", Values.TITANIUM_SPEED_DEFAUlT,
                "Set the speed of Titanium tools (negative). [" + Values.TITANIUM_SPEED_MIN + " ~ " + Values.TITANIUM_SPEED_MAX + "] Default: " + Values.TITANIUM_SPEED_DEFAUlT, Values.TITANIUM_SPEED_MIN, Values.TITANIUM_SPEED_MAX);
        propertyTitaniumSpeed.setLanguageKey("gui.modtest.propertyTitaniumSpeed").setRequiresMcRestart(true);

        Property propertyCopperDurability = config.get(CATEGORY_NAME_MATERIAL, "Copper Durability", Values.COPPER_DURABILITY_DEFAULT,
                "Set the durability of Copper tools. [" + Values.COPPER_DURABILITY_MIN + " ~ " + Values.COPPER_DURABILITY_MAX + "] Default: " + Values.COPPER_DURABILITY_DEFAULT, Values.COPPER_DURABILITY_MIN, Values.COPPER_DURABILITY_MAX);
        propertyCopperDurability.setLanguageKey("gui.modtest.propertyCopperDurability");

        Property propertyCopperSpeed = config.get(CATEGORY_NAME_MATERIAL, "Copper Speed", Values.COPPER_SPEED_DEFAUlT,
                "Set the speed of Copper tools (negative). [" + Values.COPPER_SPEED_MIN + " ~ " + Values.COPPER_SPEED_MAX + "] Default: " + Values.COPPER_SPEED_DEFAUlT, Values.COPPER_SPEED_MIN, Values.COPPER_SPEED_MAX);
        propertyCopperSpeed.setLanguageKey("gui.modtest.propertyCopperSpeed").setRequiresMcRestart(true);

        List<String> propOrderMaterial = new ArrayList<String>();
        propOrderMaterial.add(propertyRubyDurability.getName());
        propOrderMaterial.add(propertyRubySpeed.getName());
        propOrderMaterial.add(propertyTitaniumDurability.getName());
        propOrderMaterial.add(propertyTitaniumSpeed.getName());
        propOrderMaterial.add(propertyCopperDurability.getName());
        propOrderMaterial.add(propertyCopperSpeed.getName());
        config.setCategoryPropertyOrder(CATEGORY_NAME_MATERIAL, propOrderMaterial);


        if (readFieldsFromConfig) {
            rubyDurability = propertyRubyDurability.getInt(Values.RUBY_DURABILITY_DEFAULT);
            if (rubyDurability > Values.RUBY_DURABILITY_MAX || rubyDurability < Values.RUBY_DURABILITY_MIN) {
                rubyDurability = Values.RUBY_DURABILITY_DEFAULT;
            }
            rubySpeed = (float) propertyRubySpeed.getDouble(Values.RUBY_SPEED_DEFAUlT);
            if (rubySpeed > Values.RUBY_SPEED_MAX || rubySpeed < Values.RUBY_SPEED_MIN) {
                rubySpeed = Values.RUBY_SPEED_DEFAUlT;
            }
            titaniumDurability = propertyTitaniumDurability.getInt(Values.TITANIUM_DURABILITY_DEFAULT);
            if (titaniumDurability > Values.TITANIUM_DURABILITY_MAX || titaniumDurability < Values.TITANIUM_DURABILITY_MIN) {
                titaniumDurability = Values.TITANIUM_DURABILITY_DEFAULT;
            }
            titaniumSpeed = (float) propertyTitaniumSpeed.getDouble(Values.TITANIUM_SPEED_DEFAUlT);
            if (titaniumSpeed > Values.TITANIUM_SPEED_MAX || titaniumSpeed < Values.TITANIUM_SPEED_MIN) {
                titaniumSpeed = Values.TITANIUM_SPEED_DEFAUlT;
            }
            copperDurability = propertyRubyDurability.getInt(Values.COPPER_DURABILITY_DEFAULT);
            if (copperDurability > Values.COPPER_DURABILITY_MAX || copperDurability < Values.COPPER_SPEED_MIN) {
                copperDurability = Values.COPPER_DURABILITY_DEFAULT;
            }
            copperSpeed = (float) propertyCopperSpeed.getDouble(Values.COPPER_SPEED_DEFAUlT);
            if (copperSpeed > Values.COPPER_SPEED_MAX || copperSpeed < Values.COPPER_SPEED_MIN) {
                copperSpeed = Values.COPPER_SPEED_DEFAUlT;
            }


        }

        propertyRubyDurability.set(rubyDurability);
        propertyRubySpeed.set(rubySpeed);
        propertyTitaniumDurability.set(titaniumDurability);
        propertyTitaniumSpeed.set(titaniumSpeed);
        propertyCopperDurability.set(copperDurability);
        propertyCopperSpeed.set(copperSpeed);

        if (config.hasChanged()) {
            config.save();
        }
    }

    private static Configuration config = null;

    public static class ConfigEventHandler {

        @SubscribeEvent(priority = EventPriority.NORMAL)
        public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (Strings.MODID.equals(event.getModID()) && !event.isWorldRunning()) {
                if (event.getConfigID().equals(CATEGORY_NAME_GENERAL) || event.getConfigID().equals(CATEGORY_NAME_OTHER)
                        || event.getConfigID().equals(CATEGORY_NAME_MATERIAL) || event.getConfigID().equals(CATEGORY_NAME_WORLD)) {
                    syncFromGUI();
                }
            }
        }
    }

}
