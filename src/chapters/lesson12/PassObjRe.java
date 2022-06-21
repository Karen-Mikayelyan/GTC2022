package chapters.lesson12;

public class PassObjRe {
    public static void main(String[] args) {
        CallByValue1 ob = new CallByValue1(15,20);
        System.out.println("ob.a and ob.b before the call: " + ob.a + " " + ob.b);

//        ob.meth();

        System.out.println("ob.a and ob.b before the call: " + ob.a + " " + ob.b);
    }
}
