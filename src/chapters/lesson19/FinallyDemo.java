package chapters.lesson19;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("procA() մեթոդի մարմինը");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("procA() մեթոդի մեջ finally օպերատորի բլոկը");
        }
    }
    static void procB() {
        try {
            System.out.println("procB() մեթոդի մարմինը");
            return;
        } finally {
            System.out.println("procB() մեթոդի մեջ finally օպերատորի բլոկը");
        }
    }
    static void procC() {
        try {
            System.out.println("procC() մեթոդի մարմինը");
            return;
        } finally {
            System.out.println("procC() մեթոդի մեջ finally օպերատորի բլոկը");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Բացառությունը բռնվել է");
        }
        procB();
        procC();
    }
}
