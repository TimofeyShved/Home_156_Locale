package com.company.locale;

import java.awt.*;
import java.util.ListResourceBundle;

public class text_en extends ListResourceBundle {

    private static final Object[][] contents = {
            {"value", "Text(en)"},
            {"backgroundColor", Color.WHITE},
            {"defaultPaperSize", new double[]{210,297}}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}