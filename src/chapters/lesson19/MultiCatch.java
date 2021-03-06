package chapters.lesson19;

import chapters.lesson6.Array;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try {
            int result = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Բացառությունը բռնվել է։ " + e);
        }
        System.out.println("հետո բազմակի բռնված բացառություն․");
    }
}
