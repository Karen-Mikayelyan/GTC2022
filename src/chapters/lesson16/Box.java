package chapters.lesson16;

public class Box {
    public double width;
    public double height;
    public double depth;


    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public double volume() {
        return width * height * depth;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (Double.compare(box.width, width) != 0) return false;
        if (Double.compare(box.height, height) != 0) return false;
        return Double.compare(box.depth, depth) == 0;
    }

}


