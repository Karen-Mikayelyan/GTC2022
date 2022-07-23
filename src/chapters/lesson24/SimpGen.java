package chapters.lesson24;

public class SimpGen {

    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Gen");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);


    }

}
