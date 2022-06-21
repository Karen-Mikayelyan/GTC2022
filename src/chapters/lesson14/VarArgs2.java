package chapters.lesson14;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("One variable length parameter: ", 10);
        vaTest("Three variables length parameter: ", 1, 2, 3);
        vaTest("Without variable length parameters: ");
    }

}
