package lesson8;

import javax.crypto.spec.PSource;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("բացարձակ արժեք ");
        System.out.println(i + " = " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("բացարձակ արժեք ");
        System.out.print("բացարձակ արժեք ");
        System.out.println(i + " = " + k);
    }
}
