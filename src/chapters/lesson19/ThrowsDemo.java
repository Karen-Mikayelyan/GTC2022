package chapters.lesson19;

public class ThrowsDemo {
    static void throwOne() {
        System.out.println("throwOne() մեթոդի մարմինը");
        throw new IllegalArgumentException("demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalArgumentException e) {
            System.out.println("Բացառութունը բռնվել է ։" + e);
        }
    }
}
