package homework.collection;

import java.util.*;


public class CollectionExample {


    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(0, "Karen");
        arrayList.add(1, "Hovhannes");
        arrayList.add(2, "Firdus");
        arrayList.add(3, "Hracho");
        arrayList.add(4, "Garik");
        arrayList.add(5, "Petros");
        arrayList.add(6, "Samvel");
        arrayList.add(7, "Davit");
        arrayList.add(8, "Rafik");
        arrayList.add(9, "Gevorg");
//        System.out.println(arrayToList(new String[]{"poxos", "petros", "barduximeos", "pompeos", "krasos"}));
//        System.out.println(arrayList);
//        System.out.println(removeById(arrayList, 3));
//        System.out.println(listToSet(arrayList));
        List<Integer> numberList = new LinkedList<>();
        numberList.add(5);
        numberList.add(7);
        numberList.add(9);
        numberList.add(14);
        numberList.add(18);
        numberList.add(25);
        System.out.println(listToLinkedList(numberList));
        System.out.println(reverseNumbers(numberList));
        printFirstFive(arrayList);
        System.out.println(sizeOfList(arrayList));

    }


    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);
            if (values.length == arrayList.size()) {
                return arrayList;
            }

        }

        return null;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        List<String> nameList = new ArrayList<>();
        for (String names : list) {
            nameList.add(names);
            if (nameList.size() == list.size()) {
                list.remove(index);
                return list;
            }
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> hashList = new HashSet<>();
        for (String s : list) {
            hashList.add(s);
            if (list.size() == hashList.size()) {
                return hashList;
            }
        }
        return null;

    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (Integer integer : list) {
            numbers.add(integer);
            if (list.size() == numbers.size()) {
                return numbers;
            }
        }
        return null;
    }


    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static int reverseNumbers(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer integer : list) {
            integerList.add(integer);
        }
        if (list.size() == integerList.size()) {
            List<Integer> resultList = new ArrayList<>();
            for (Integer integer1 : resultList) {
                resultList.add(integer1);
                if (list.size() == resultList.size()) {
                    Collections.reverse(resultList);
                    return integer1;
                }
            }
            }
        return 0;
    }



    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        List<String> stringList = new ArrayList<>();
        for (String s : list) {
            stringList.add(s);
            if (list.size() == stringList.size()) {
                System.out.println(stringList.subList(0, 5));
            }
        }
    }


    //    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        List<String> sizeList = new ArrayList<>();
        for (String s : list) {
            sizeList.add(s);
            if (list.size() == sizeList.size()) {
                return sizeList.size();
            }

        }
        return 0;

    }

}