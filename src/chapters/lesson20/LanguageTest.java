package chapters.lesson20;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class LanguageTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
//        Language lang = Language.RU;
//        System.out.println(Language.HY);
//
//        Language.valueOf("Ru".toUpperCase());

//        switch (lang) {
//            case HY:
//                System.out.println("Ողջույն");
//                break;
//            case RU:
//                System.out.println("Привет");
//                break;
//            case ENG:
//                System.out.println("Hello");
//                break;
//            default:
//                System.out.println("Hola");
//
//        }

        System.out.println("please choose language from list");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value + ", ");
        }
        Language.CH.setCountry("China");
        System.out.println();
        String langStr = scanner.nextLine();
        if (langStr != null) {
            try {
                Language chooseLang = Language.valueOf(langStr.toUpperCase());
                System.out.println("chosen: " + chooseLang);
                System.out.println("country: " + chooseLang.getCountry());
                System.out.println("index: " + chooseLang.ordinal());
            } catch (IllegalArgumentException e) {
                System.out.println("Please choose correct Language");
            }

        }
    }
}
