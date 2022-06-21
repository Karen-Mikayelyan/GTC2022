package chapters.lesson15;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume weightBox = " + vol);
        System.out.println("Weight weightBox = " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume plainBox = " +vol);

        System.out.println("Weight plainBox = " + plainBox.weight);
    }
}
