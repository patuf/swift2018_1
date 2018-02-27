package hmw07;

public class Circle extends Shape {
    private final static double PI = 3.141592654;
    private double r;

    Circle( double r) {
        super();// enter name
        this.r = r;

    }

    public double getRadius() {
        return this.r;
    }


    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}
