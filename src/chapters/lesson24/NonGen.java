package chapters.lesson24;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("object ob : "
                + ob.getClass().getName());
    }
}
