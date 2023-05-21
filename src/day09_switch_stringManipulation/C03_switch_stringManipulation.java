package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_switch_stringManipulation {
    public static void main(String[] args) {
        String str ="Java Candir";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str= str.toUpperCase();

        System.out.println(str);

        System.out.println(str.toLowerCase());

        str= str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str);
    }
}
