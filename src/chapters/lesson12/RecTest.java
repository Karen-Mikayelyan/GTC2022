package chapters.lesson12;

public class RecTest {
    public static void main(String[] args) {
        Recursion2 ob = new Recursion2(10);
        int i;
        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
