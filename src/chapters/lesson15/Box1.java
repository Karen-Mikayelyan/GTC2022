//package chapters.lesson15;
//
//public class Box1 {
//    private double width;
//    private double height;
//    private double depth;
//
//    Box1(Box1 ob) {
//        width = ob.width;
//        height = ob.height;
//        depth = ob.depth;
//    }
//
//    Box1(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
//
//    Box1() {
//        width = -1;
//        height = -1;
//        depth = -1;
//    }
//
//    Box1(double len) {
//        width = height = depth = len;
//    }
//
//    double volume() {
//        return width * height * depth;
//    }
//
//    class BoxWeight extends Box1 {
//        double weight;
//
//        BoxWeight(double w, double h, double d, double m) {
//            super(w, h, d);
//            weight = m;
//        }
//        BoxWeight() {
//            super();
//            weight = -1;
//        }
//        BoxWeight(double len, double m) {
//            super(len);
//            weight = m;
//        }
//    }
//}
//class DemoSuper {
//    public static void main(String[] args) {
//        Box1Weight myBox1 = new Box1Weight(10, 20, 15, 34.3);
//        Box1Weight myBox2 = new Box1Weight(2, 3, 4, 0.076);
//        Box1Weight myBox3 = new Box1Weight();
//        Box1Weight myCube = new Box1Weight(3, 2);
//        Box1Weight myClone = new Box1Weight(myBox1);
//        double vol;
//
//        vol = myBox1.volume();
//        System.out.println("Volume myBox1 = " + vol);
//        System.out.println("Weight myBox1 = " + myBox1.weight);
//        System.out.println();
//
//        vol = myBox2.volume();
//        System.out.println("Volume myBox2 = " + vol);
//        System.out.println("Weight myBox2 = " + myBox2.weight);
//        System.out.println();
//
//        vol = myBox3.volume();
//        System.out.println("Volume myBox3 = " + vol);
//        System.out.println("Weight myBox3 = " + myBox3.weight);
//        System.out.println();
//
//        vol = myClone.volume();
//        System.out.println("Volume myClone = " + vol);
//        System.out.println("Weight myClone = " + myClone.weight);
//        System.out.println();
//
//        vol = myCube.volume();
//        System.out.println("Volume myCube = " + vol);
//        System.out.println("Weight myCube = " + myCube.weight);
//        System.out.println();
//    }
//}
