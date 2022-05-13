package Homework.chapters2.lesson5;


public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nb = (byte)i");
        b = (byte) i;
        System.out.println("i և b " + i + " " + b);
        System.out.println("\ni = (int)d");
        i = (int) d;
        System.out.println("d և i " + d + " " + i);
        System.out.println("\nb = (byte)d");
        b = (byte) d;
        System.out.println("d և b " + d + " " + b);


    }
}
