package com.samAndDan.modTest.config;

import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.lib.Values;
import com.samAndDan.modTest.utils.StringUtils;
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
    public static final String CATEGORY_NAME_MATERIAL = StringUtils.localize("config.modtest.category.material.name");
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

    /**
     * Synchronise the three copies of the data
     * 1) loadConfigFromFile && readFieldsFromConfig -> initialise everything from the disk file
     * 2) !loadConfigFromFile && readFieldsFromConfig --> copy everything from the config file (altered by GUI)
     * 3) !loadConfigFromFile && !readFieldsFromConfig --> copy everything from the native fields
     *
     * @param loadConfigFromFile   if true, load the config field from the configuration file on disk
     * @param readFieldsFromConfig if true, reload the member variables from the config field
     */

    private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig) {
        if (loadConfigFromFile) {
            config.load();
        }

        Property propertyRubyDurability = config.get(CATEGORY_NAME_MATERIAL, StringUtils.localize("config.modtest.rubyDurability.name"), Values.RUBY_DURABILITY_DEFAULT,
                StringUtils.localize("config.modtest.rubyDurability.comment"), Values.RUBY_DURABILITY_MIN, Values.RUBY_DURABILITY_MAX);

        Property propertyRubySpeed = config.get(CATEGORY_NAME_MATERIAL, StringUtils.localize("config.modtest.rubySpeed.name"), Values.RUBY_SPEED_DEFAUlT,
                StringUtils.localize("config.modtest.rubySpeed.comment"), Values.RUBY_SPEED_MIN, Values.RUBY_SPEED_MAX);

        List<String> propOrderGeneral = new ArrayList<String>();
        propOrderGeneral.add(propertyRubyDurability.getName());
        propOrderGeneral.add(propertyRubySpeed.getName());
        config.setCategoryPropertyOrder(CATEGORY_NAME_MATERIAL, propOrderGeneral);


        if (readFieldsFromConfig) {
            rubyDurability = propertyRubyDurability.getInt(Values.RUBY_DURABILITY_DEFAULT);
            if (rubyDurability > Values.RUBY_DURABILITY_MAX || rubyDurability < Values.RUBY_DURABILITY_MIN) {
                rubyDurability = Values.RUBY_DURABILITY_DEFAULT;
            }
            rubySpeed = (float) propertyRubyDurability.getDouble(Values.RUBY_SPEED_DEFAUlT);
            if (rubySpeed > Values.RUBY_SPEED_MAX || rubySpeed < Values.RUBY_SPEED_MIN) {
                rubySpeed = Values.RUBY_SPEED_DEFAUlT;
            }


        }


        propertyRubyDurability.set(rubyDurability);


        if (config.hasChanged()) {
            config.save();
        }
    }

    private static Configuration config = null;

    public static class ConfigEventHandler {

        @SubscribeEvent(priority = EventPriority.NORMAL)
        public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (Strings.MODID.equals(event.getModID())
                    && !event.isWorldRunning()) {
                if (event.getConfigID().equals(CATEGORY_NAME_GENERAL)
                        || event.getConfigID().equals(CATEGORY_NAME_OTHER)) {
                    syncFromGUI();
                }
            }
        }
    }

}
