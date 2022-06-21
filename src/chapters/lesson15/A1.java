package chapters.lesson15;

public class A1 {
    int i;
    private int j;

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }


    class B extends A {
        int total;

        void sum() {
            total = i + j;
        }
    }
}


