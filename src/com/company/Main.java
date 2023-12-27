package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
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

        // -------------- через ресурсы
        System.out.println("-------------------");

        // выбор значений от региона
        ResourceBundle bundle1 = ResourceBundle.getBundle("textLocal", new Locale("en", "US"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("textLocal", locale2);
        ResourceBundle bundle3 = ResourceBundle.getBundle("textLocal", locale3);

        System.out.println(bundle1.getString("value"));
        System.out.println(bundle2.getString("value"));
        System.out.println(bundle3.getString("value"));
        // ?? - исправим:
        System.out.println(new String(bundle3.getString("value").getBytes("ISO-8859-1"), "UTF-8"));

        // -------------- через классы
        System.out.println("-------------------");

        // выбор значений от региона
        ResourceBundle bundle4 = ResourceBundle.getBundle("com.company.locale.text", locale1);
        ResourceBundle bundle5 = ResourceBundle.getBundle("com.company.locale.text", locale2);
        ResourceBundle bundle6 = ResourceBundle.getBundle("com.company.locale.text", locale3);

        System.out.println(bundle4.getString("value"));
        System.out.println(bundle5.getString("value"));
        System.out.println(bundle6.getString("value"));


    }
}
