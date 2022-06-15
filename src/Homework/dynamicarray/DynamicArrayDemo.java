package Homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        da.add(4);
        da.add(5);
        da.add(7);
        da.add(5);
        System.out.println(da.getByIndex(2));
        System.out.println(da.getFirstIndexByValue(7));
        da.set(1, 8);
        System.out.println();
        da.add(1, 9);
        System.out.println();
        da.delete(2);
    }
}
