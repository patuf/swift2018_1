package Shapes;

public class Rectangle extends Shape{
    private String name = "rectangle";
    protected double a;
    protected double b;


    Rectangle(double a,double b,int x, int y, int fill, int color){
        super(x,y,fill,color);
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return perimeter = 2*a + 2*b;
    }

    public double getArea() {
        return area = a*b;
    }

    @Override
    public String getName() {
        return name;
    }
}
