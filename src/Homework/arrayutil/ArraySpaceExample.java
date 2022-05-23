package Homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        //  Ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
        // Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝ կունենանք cat b i b (մեջտեղի սինվոլները մնալու են)

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        for (int i = 1; i < spaceArray.length - 2; i++) {

            System.out.print(spaceArray[i]);
        }
        System.out.println();
        System.out.println("..............");

        char[] result = {'c', 'a', 't', ' ', 'b', 'i', ' ', 'b'};

        for (char c : result) {
            if (result[0] == 'c' && result[result.length - 1] == 'b') {
                System.out.print(c);

            }
        }

    }

}


