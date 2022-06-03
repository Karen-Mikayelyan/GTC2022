package Homework.arrayutil;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 14, 7, 20, 18, 25, 27};
        ArrayUtil1 au = new ArrayUtil1();
        au.numbers(array);
        System.out.println();
        System.out.println("max : " + au.max(array));
        System.out.println("min : " + au.min(array));
        au.evenNumbers(array);
        System.out.println();
        au.oddNumbers(array);
        System.out.println();
        au.evensCount(array);
        au.oddsCount(array);
        System.out.println();
        au.sum(array);
        System.out.println();
        au.avg(array);
    }
}
