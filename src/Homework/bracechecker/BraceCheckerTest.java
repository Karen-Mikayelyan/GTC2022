package Homework.bracechecker;

import javax.crypto.spec.PSource;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "H){e(l[lo }}{from}[ (Java)]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();


    }



}
