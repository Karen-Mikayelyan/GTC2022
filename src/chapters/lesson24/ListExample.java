package chapters.lesson24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("poxos");
        linkedList.add("poxos");

        for (String s : linkedList) {
            System.out.println(s);
        }


    }


}
