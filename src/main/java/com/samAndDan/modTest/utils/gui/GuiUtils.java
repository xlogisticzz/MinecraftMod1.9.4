package com.samAndDan.modTest.utils.gui;

import net.minecraft.client.gui.FontRenderer;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class GuiUtils {
    public static void drawCenteredString(FontRenderer fontRenderer, String string, int x, int y, int colour) {
        fontRenderer.drawString(string, x - fontRenderer.getStringWidth(string) / 2, y, colour);
    }
}
