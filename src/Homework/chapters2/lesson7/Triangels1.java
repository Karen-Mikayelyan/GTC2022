package Homework.chapters2.lesson7;

public class Triangels1 {
        public static void main(String[] args) {
            /*    Figure 4

             * * * * *
             * * * *
             * * *
             * *
             *

             * */
            int height = 5;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = height; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            /*   Figure 5

             *       3
            * *      2
           * * *     1
          * * * *    0
           * * *    -1
            * *     -2
             *      -3

             * */

            for (int i = 3; i >= -3; i--) {
                int y = i;
                if (i < 0) {
                    y = -i;
                }
                for (int j = 3 - y; j < 4; j++) {
                    System.out.print(" ");
                }
                for (int j = y; j < 4; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

                  /*.Շեղանկյան խնդրի լուծման 2-րդ տարբերակը 2 մասով

                      *
                     * *
                    * * *
                   * * * *
                  _________
                    * * *
                     * *
                      *
                   */
            System.out.println("........");
            for (int i = 0; i < 4; i++) {
                for (int j = i; j <= 3; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 1 - i; j < 3; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < 3; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        }
           



    


