package chapters.lesson24;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("value : " + v);
        System.out.println();

//        NonGen str = (String) strOb.getOb();
//        System.out.println("value : " + str);

//        iOb = strOb;
        v = (Integer) iOb.getOb();
    }

//Սխալ
}
