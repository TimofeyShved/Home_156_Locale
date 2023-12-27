package com.company.locale;

import java.awt.*;
import java.util.ListResourceBundle;

public class text_fr extends ListResourceBundle {

    private static final Object[][] contents = {
            {"value", "Text(fr)"},
            {"backgroundColor", Color.WHITE},
            {"defaultPaperSize", new double[]{210,297}}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
