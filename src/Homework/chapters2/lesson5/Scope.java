package Homework.chapters2.lesson5;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x և y " + x + " " + y);
            x = y * 2;
        }
        // y = 100;
        System.out.println("x = " + x);

    }
}
