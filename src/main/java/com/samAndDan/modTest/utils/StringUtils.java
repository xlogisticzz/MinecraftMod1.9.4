package com.samAndDan.modTest.utils;

import net.minecraft.util.text.translation.I18n;

public class StringUtils {

    public static String localize(String string) {
        return I18n.translateToLocal(string);

    }

    public static boolean canLocalize(String string) {
        return I18n.canTranslate(string);
    }

    public static String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
