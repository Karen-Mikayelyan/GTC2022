package chapters.lesson13;

public class AccessTest {
    public static void main(String[] args) {
        Access ob = new Access();

        ob.a = 10;
        ob.b = 20;

//        ob.c = 100; // Error !

        ob.setC(100);
        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
