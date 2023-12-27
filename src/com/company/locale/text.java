package com.company.locale;

import java.awt.*;
import java.util.ListResourceBundle;

public class text extends ListResourceBundle {

    private static final Object[][] contents = {
            {"value", "Text(defoult)"},
            {"backgroundColor", Color.WHITE},
            {"defaultPaperSize", new double[]{210,297}}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
