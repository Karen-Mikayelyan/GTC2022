package Homework;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 50, 77, 14, -5, 30};
        int[] array2 = {3, 6, 8, 12, 15, -17, 35, 55, 47, 75};
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.calAge(5));
        System.out.println(ph.convert(2));
        System.out.println(ph.isSameNum(8, 10));
        System.out.println(ph.lessThanOrEqualToZero(-7));
        System.out.println(ph.maxLength(array1, array2));
        System.out.println(ph.nextNumber(7));
        System.out.println(ph.reverseBool(true));

    }
}
