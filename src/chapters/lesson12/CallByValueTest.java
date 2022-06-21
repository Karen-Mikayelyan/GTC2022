package chapters.lesson12;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();

        int a = 15, b = 20;

        System.out.println("a and b before the call " + a + " " + b);

        ob.meth(15, 20);

        System.out.println("a and b after the call " + a + " " + b);
    }


}
