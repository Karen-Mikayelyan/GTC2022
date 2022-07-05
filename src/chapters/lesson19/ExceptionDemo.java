package chapters.lesson19;

import jdk.jshell.EvalException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            printWithoutWhiteSpace("ghfg");
        } catch (NoWhiteSpaceException | NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after method call");
    }

    static void printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("value can't be null");
        }
        if (value.equals("")) {
            throw new IllegalArgumentException("value can't be empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException("value does not contain white space");
        }
        System.out.println(value.trim());
    }
}

