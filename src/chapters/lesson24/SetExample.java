package chapters.lesson24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();

        hashSet.add("zaven");
        hashSet.add("poxos");
        hashSet.add("martiros");
        hashSet.add("aram");
        hashSet.add("babken");

        for (String s : hashSet) {
            System.out.println(s);
        }


    }

}
