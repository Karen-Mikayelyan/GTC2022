package chapters.lesson11;

public class Box1 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
