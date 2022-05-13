package Homework.chapters2.lesson6;

public class Triangels {
    public static void main(String[] args) {
        /* Figure 1

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("............");

        /*  Figure 2

                 *
               * *
             * * *
           * * * *
         * * * * *

         */
        for (int i = 0; i < height; i++) {
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println(".........");

        /*   Figure 3

         * * * * *   0      5
         * * * *     1      4
         * * *       2      3
         * *         3      2
         *           4      1

         */
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
