package swift2018_1.hristo.shape;

public class Circle extends Shape{

    public final double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getPI() {
        return PI;
    }

    public double setPerimeter(){
        return  perimeter = 2 * PI * radius;
    }

    public double setArea(){
        return area = PI * radius * radius;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }


    @Override
    public String describeMe() {
        return getName() + " " + setArea() + " " + setPerimeter();
    }

    @Override
    public int getColor(int color) {
        return 0;
    }

    @Override
    public String getCoordinates(int x, int y) {
        return (x + " " + y);
    }

    @Override
    public int getFill() {
        return 0;
    }
}
