package chapters.lesson19;

public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("Բացառությունը բռնված է demoProc() մեթոդի մարմնի մեջ");
            throw e;
        }

    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Կրկնակի բռնել։" + e);
        }
    }
}

