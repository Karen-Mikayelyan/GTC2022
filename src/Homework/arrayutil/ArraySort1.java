package Homework.arrayutil;

public class ArraySort1 {

    void BublleSortGrow(int[] numbers) {

        // 1. Գրել կոդ, որը մասիվի էլեմենտները կդասավորի փոքրից մեծ/աճման կարգով/ Bubble Sort

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
    }

    // 1․1 Գրել կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր/նվազման կարգով/

    void BubbleSortDecreased(int[] numbers) {
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
    }
}
