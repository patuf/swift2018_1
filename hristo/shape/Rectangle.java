package swift2018_1.hristo.shape;

public class Rectangle extends Square {

    public double b;
    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double setPerimeter(){
        return perimeter = 2 * a + 2 * b;
    }

    public double setArea (){
        return a * b;
    }


    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String describeMe() {
        return getName() + " " + setArea() + " " + setPerimeter();
    }
}
