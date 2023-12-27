package com.company.locale;

import java.awt.*;
import java.util.ListResourceBundle;

public class text_ru extends ListResourceBundle {

    private static final Object[][] contents = {
            {"value", "Text(рус)"},
            {"backgroundColor", Color.WHITE},
            {"defaultPaperSize", new double[]{210,297}}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
