package chapters.lesson14;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Number of arguments: " + v.length + " Content: ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}

