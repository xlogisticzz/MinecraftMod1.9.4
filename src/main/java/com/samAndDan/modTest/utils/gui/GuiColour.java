package com.samAndDan.modTest.utils.gui;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public enum GuiColour {
    BLACK(0),
    BLUE(1),
    GREEN(2),
    CYAN(3),
    RED(4),
    PURPLE(5),
    ORANGE(6),
    LIGHTGRAY(7),
    GRAY(8),
    LIGHTBLUE(9),
    LIME(10),
    TURQUISE(11),
    PINK(12),
    MAGENTA(13),
    YELLOW(14),
    WHITE(15);

    private int id;

    GuiColour(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\u00a7" + Integer.toHexString(id);
    }
}
