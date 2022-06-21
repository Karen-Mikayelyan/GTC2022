package chapters.lesson12;

public class OverloadDemo {

    public static void main(String[] args) {
        OverloadTest ot = new OverloadTest();
        double result;

        ot.test();
        ot.test(10);
        ot.test(10, 20);
        result = ot.test(123.25);
        System.out.println("result ot.test : " + result);

    }
}
