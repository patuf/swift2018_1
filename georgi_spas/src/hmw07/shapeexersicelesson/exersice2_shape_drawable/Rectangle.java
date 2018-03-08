package hmw07.shapeexersicelesson.exersice2_shape_drawable;

class Rectangle extends Shape {
    double a;
    double b;

    Rectangle(double a, double b, String nameShape) {
        super(nameShape);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (2 * a + 2 * b);
    }

    @Override
    public double getArea() {
        return (a * b);
    }

    @Override
    protected String getName() {
        return super.nameShape;
    }

    @Override
    public void setCoordinate(double x, double y) {
        String.format(" My coordinate are %f,%f %n .", x,y);
            }

    @Override
    public void fillShape(int isfill) {
        boolean fill=isfill==1;
        String.format("I am fill whit" +(fill ?"collor":"transperancy"));
    }

    @Override
    public void setColor(int color) {
        String.format("My colour is "+color);
    }

    @Override
    protected String describeMe() {
        return super.describeMe();
    }
}
