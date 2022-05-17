package Homework.arrayutil;

import javax.crypto.spec.PSource;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 55, 24, 77, 14, 18, 30, 25};

// Տպել մասիվի բոլոր Էլեմենտները

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + "| ");
        }
        System.out.println();
        System.out.println("....................................");

// Տպել մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < 10; i++) {
        }
        System.out.println(max);
        System.out.println(".....");

// Տպել մասիվի ամենափոքր թիվը

        int min = array[9];
        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < 10; i++) {
        }
        System.out.println(min);
        System.out.println(".....");

// Տպել մասիվի բոլոր զույգ Էլեմենտները

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " " + "| ");
            }
        }
        System.out.println();
        System.out.println("......................");


// Տպել մասիվի բոլոր կենտ Էլեմենտները

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " " + "| ");
            }
        }
        System.out.println();
        System.out.println(".....................");

// Տպել զույգերի քանակը
        int even = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {

                even++;
            }
        }
        System.out.print("even numbers : " + even);
        System.out.println();
        System.out.println("................");

// Տպել կենտերի քանակը
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 != 0) {

                odd++;
            }
        }
        System.out.print("odd numbers : " + odd);
        System.out.println();
        System.out.println("...............");

// Տպել մասիվի բոլոր թվերի միջին թվաբանականը
        int sumNumbers = 0;
        for (int i = 0; i < 10; i++) {
            sumNumbers = sumNumbers + array[i];
        }
        System.out.print(sumNumbers / 10);
        System.out.println();
        System.out.println(".............");
// Տպել մասիվի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.print("sumNumbers : " + sum);
        System.out.println();
        System.out.println("..............");
    }

}
