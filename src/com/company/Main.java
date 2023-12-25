package com.company;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // Локализация
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = Locale.FRANCE;
        Locale locale3 = Locale.getDefault();
        System.out.println(locale3);

        // Вывести все возможные локализации
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale l: locales){
            //System.out.println(l);
        }

        // Так же можно указать локализацию в опциях(сборшике)
        // -Duser.language=ru-Duser.region=RU

        //указать деньги
        System.out.println(NumberFormat.getCurrencyInstance(locale1).format(1000));
        System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));
        System.out.println(NumberFormat.getCurrencyInstance(locale3).format(1000));

        //указать дату
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale1).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale2).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale3).format(new Date()));
    }
}
