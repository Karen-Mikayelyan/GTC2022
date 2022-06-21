package chapters.lesson12;

public class OverloadDemo1 {
    public static void main(String[] args) {
        OverloadTest1 ot = new OverloadTest1();
        int i = 88;
        ot.test();
        ot.test(10, 20);
        ot.test(i);
        ot.test(123.2);
    }
}
