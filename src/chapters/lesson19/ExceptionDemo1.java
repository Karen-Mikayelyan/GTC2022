package chapters.lesson19;

public class ExceptionDemo1 {
    static void compute(int a) throws MyException {
        System.out.println("կանչվել է compute(" + a + ") մեթոդը");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("նորմալ իրականացում");
    }


    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Բացառությունը բռնվել է։" + e);
        }
    }
}
