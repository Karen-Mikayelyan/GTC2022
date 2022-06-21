package chapters.lesson12;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.function.BooleanSupplier;

public class OverloadCons {
    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("vol myBox1 = " + vol);

        vol = myBox2.volume();
        System.out.println("vol myBox2 = " + vol);

        vol = myCube.volume();
        System.out.println("vol myCube = " + vol);
    }
}