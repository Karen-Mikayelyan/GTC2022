package chapters.lesson12;

public class OverloadTest1 {
    void test() {
        System.out.println("Parameters missing");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Internal conversion on call " + " test(double a : )" + a);
    }
}




