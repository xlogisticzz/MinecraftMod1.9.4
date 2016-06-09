package com.samAndDan.modTest.config;


import com.samAndDan.modTest.lib.Strings;
import com.samAndDan.modTest.utils.StringUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GuiFactory implements IModGuiFactory {

    @Override
    public void initialize(Minecraft minecraftInstance) {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return ConfigGui.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }

    public static class ConfigGui extends GuiConfig {
        public ConfigGui(GuiScreen parentScreen) {
            super(parentScreen, getConfigElements(), Strings.MODID,
                    false, false, I18n.format("gui.modtest.mainTitle"));
        }

        private static List<IConfigElement> getConfigElements() {
            List<IConfigElement> list = new ArrayList<IConfigElement>();

            list.add(new DummyConfigElement.DummyCategoryElement("mainCfg", "gui.modtest.general", CategoryEntryGeneral.class));
            list.add(new DummyConfigElement.DummyCategoryElement(StringUtils.localize("gui.modtest.material"), "gui.modtest.material", CategoryEntryMaterial.class));
            list.add(new DummyConfigElement.DummyCategoryElement("miscCfg", "gui.modtest.other", CategoryEntryOther.class));
            return list;
        }

        public static class CategoryEntryGeneral extends GuiConfigEntries.CategoryEntry {
            public CategoryEntryGeneral(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen() {
                Configuration configuration = ModConfiguration.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(ModConfiguration.CATEGORY_NAME_GENERAL));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        ModConfiguration.CATEGORY_NAME_GENERAL,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
            }
        }

        public static class CategoryEntryMaterial extends GuiConfigEntries.CategoryEntry {
            public CategoryEntryMaterial(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen() {
                Configuration configuration = ModConfiguration.getConfig();
                ConfigElement cat_material = new ConfigElement(configuration.getCategory(ModConfiguration.CATEGORY_NAME_MATERIAL));
                List<IConfigElement> propertiesOnThisScreen = cat_material.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        ModConfiguration.CATEGORY_NAME_MATERIAL,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
            }
        }

        public static class CategoryEntryOther extends GuiConfigEntries.CategoryEntry {
            public CategoryEntryOther(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen() {
                Configuration configuration = ModConfiguration.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(ModConfiguration.CATEGORY_NAME_OTHER));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        ModConfiguration.CATEGORY_NAME_OTHER,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
            }
        }
    }


}
