package chapters.lesson12;

public class CallByValue1 {

    int a, b;

    CallByValue1(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
