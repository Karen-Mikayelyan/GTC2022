package chapters.lesson15;

public class BoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume MyBox1 = " + vol);
        System.out.println("Weight myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume myBox2 = " + vol);
        System.out.println("Weight myBox2 = " + myBox2.weight);
    }
}
