package Homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {

        // 1. Գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մասիվի մեջ, ու տպել այդ քանակը
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int cCuantity = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                cCuantity++;
                System.out.print("с : " + cCuantity);
            }
            System.out.println();
        }

        // 2․ Տպել մեջտեղի 2 սիմվոլները
        char[] chars1 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars1.length; i++) {
        }
        System.out.print("middle two simvols : " + chars1[chars1.length / 2 - 1] + " " + chars1[chars1.length / 2]);
        System.out.println();

        // 3․ տպել true, եթե մասիվը վերջանում է ly -ով, եթե ոչ՝ false
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = true;
        for (int i = chars2.length - 2; i < chars2.length; i++) {
            if (chars2[chars2.length - 2] == 'l' && chars2[chars2.length - 1] == 'y') {
                b = true;
            } else {
                b = false;
            }
        }
        System.out.println(b);

        // 3 -րդ խնդրի լուծման այլ տարբերակ
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        for (int i = chars3.length - 2; i < chars3.length; i++) {
            boolean b1 = chars3[chars2.length - 2] == 'l' && chars3[chars2.length - 1] == 'y' ? true : false;
            i++;
            System.out.println(b1);
        }

        // 4․ Տպել true , եթե տեքստը պարունակում է bob բառը, բայց o -ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        // օր․ abcbob -> true, b9b -> true, բայց bac -> false
        for (int i = 0; i < bobArray.length; i++) {
            if(bobArray[i] == 'b' && bobArray[i + 2] == 'b'){
                System.out.println(true);
            }
        }

        // 5. Տպել մասիվի այն սինվոլները, որոնք պռաբել չեն
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 2; i < text.length - 2; i++) {
            System.out.print(text[i]);
        }
    }
}