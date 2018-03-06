package swift2018_1.hristo.shape;

public class Square extends Shape{

    public double a;

    public Square(double a) {
        this.a = a;
    }

    public double setPerimeter(){
        return perimeter = 4 * a;
    }

    public double setArea (){
        return a * a;
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
        return color;
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
