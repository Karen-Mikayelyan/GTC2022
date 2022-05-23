package Homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {

        // 1. Գրել կոդ, որը մասիվի էլեմենտները կդասավորի փոքրից մեծ/աճման կարգով/ Bubble Sort

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};


        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int value = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = value;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(".....................");

        // 1․1 Գրել կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր/նվազման կարգով/

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] < numbers[j + 1]) {
                    int value = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = value;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(".....................");


    }

}









