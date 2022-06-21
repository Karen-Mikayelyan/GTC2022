package chapters.lesson12;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);

        Box1 myClone = new Box1(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("vol myBox1 = " + vol);

        vol = myBox2.volume();
        System.out.println("vol myBox2 = " + vol);

        vol = myCube.volume();
        System.out.println("vol myCube = " + vol);

        vol = myClone.volume();
        System.out.println("vol myClone = " + vol);
    }
}
