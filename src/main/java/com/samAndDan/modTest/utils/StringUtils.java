package com.samAndDan.modTest.utils;


public class StringUtils {

//    public static String localize(String string) {
//        return StatCollector.translateToLocal(string);
//
//    }

//    public static boolean canLocalize(String string) {
//        return StatCollector.canTranslate(string);
//    }

    public static String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
