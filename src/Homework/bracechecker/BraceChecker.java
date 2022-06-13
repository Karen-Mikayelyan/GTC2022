package Homework.bracechecker;

import chapters.lesson11.Stack;

import javax.crypto.spec.PSource;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();
    private Stack stackForIndex = new Stack();

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int popChar;
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    popChar = stack.pop();
                    stackForIndex.pop();
                    if (popChar == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (popChar != '(') {
                        System.err.println("Error: closed " + c + " but opened " + (char) popChar + " at " + i);
                    }
                    break;
                case ']':
                    popChar = stack.pop();
                    stackForIndex.pop();
                    if (popChar == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (popChar != '[') {
                        System.err.println("Error: closed " + c + " but opened " + (char) popChar + " at " + i);
                    }
                    break;
                case '}':
                    popChar = stack.pop();
                    stackForIndex.pop();
                    if (popChar == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (popChar != '{') {
                        System.err.println("Error: closed " + c + " but opened " + (char) popChar + " at " + i);
                    }
                    break;
            }


        }
//        int last;
//        while ((last = stack.pop()) != 0) {
//            System.err.println("Error: opened " + (char) stack.pop() + " but not closed ");
//        }
        while (!stack.isEmpty()) {
            System.err.println("Error: opened " + (char) stack.pop() + " but not closed ");
        }
    }
}










