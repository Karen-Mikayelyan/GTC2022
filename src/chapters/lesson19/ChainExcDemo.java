package chapters.lesson19;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("վերին մակարդակ");
        e.initCause(new ArithmeticException("պատճառը"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Բացառությունը բռնվել է։ " + e);
            System.out.println("սկզբնապատճառ։ " + e.getCause());
        }
    }
}
