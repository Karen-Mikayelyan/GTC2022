package Homework.arrayutil;

public class ArrayUtil1 {

    // Տպել մասիվի բոլոր Էլեմենտները

    void numbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + "| ");
        }
    }

    // Գտնել մասիվի ամենամեծ թիվը և վերադարձնել այն

    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    // Գտնել մասիվի ամենափոքր թիվը և վերադարձնել այն

    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // Տպել մասիվի բոլոր զույգ Էլեմենտները

    void evenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " " + "| ");
            }
        }
    }

    // Տպել մասիվի բոլոր կենտ Էլեմենտները

    void oddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " " + "| ");
            }
        }
    }

    // Տպել զույգերի քանակը
    int evensCount(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("even numbers count : " + even);
        return even;

    }

    // Տպել կենտերի քանակը
    int oddsCount(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.print("odd numbers count : " + odd);
        return odd;
    }

    // Տպել մասիվի բոլոր թվերի միջին թվաբանականը
    void avg(int[] array) {
        int sumNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumNumbers = sumNumbers + array[i];
        }
        System.out.print("avg : " + sumNumbers / array.length);
    }

    // Տպել մասիվի էլեմենտների գումարը

    void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.print("sum : " + sum);


    }
}
