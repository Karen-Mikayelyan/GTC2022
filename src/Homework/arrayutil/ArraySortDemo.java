package Homework.arrayutil;

public class ArraySortDemo {

    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        ArraySort1 as = new ArraySort1();
        as.BublleSortGrow(numbers);
        System.out.println();
        as.BubbleSortDecreased(numbers);
    }
}
