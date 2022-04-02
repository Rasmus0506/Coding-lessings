public class Circle {
    double radius;

    public void print() {
        System.out.println("Circle: "  + radius);


    }
    public Circle(int radi) {
        radius = radi;
    }

    public double diameter() {
        return radius * 2;
    }
}
