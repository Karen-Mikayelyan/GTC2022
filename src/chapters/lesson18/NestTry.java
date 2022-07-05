package chapters.lesson18;

import chapters.lesson6.Array;

public class NestTry {
    public static void main(String[] args) {
        int a = args.length;
            /* Եթե ​​հրամանի տողին արգումենտներ նշված չեն,
            հաջորդ հայտարարության մեջ կստեղծվի
            զրոյի բաժանման բացառություն */
        int b = 42 / a;
        System.out.println("a = " + a);

        try {
            /* Եթե հրամանի տողին նշված է մեկ արգումենտ,
             ապա զրոյի բաժանման հետ կապված բացառությունը
             կգեներացվի հետևյալ կոդի մեջ */
            if (a == 1) {
                a = a / (a - a);
                /* Եթե հրամանի տողին նշված են 2 արգումենտներ,
                ապա կգեներացվի մասիվի սահմաններից դուրս գտնվելու հետ
                կապված պացառությունը */
            }
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ինդեքսը մասիվի սահմաններից դուրս է։ " + e);
        } catch (ArithmeticException e) {
            System.out.println("Զրոյի բաժանում ։ " + e);
        }
    }
}
