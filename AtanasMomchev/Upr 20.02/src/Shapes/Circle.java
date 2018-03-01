package Shapes;

public class Circle extends Shape{
    private String name = "Circle";
    double r ;
    double p = Math.PI;

    Circle(double r,int x, int y, int fill, int color){
        super(x,y,fill,color);
        this.r =r;
    }

    public String getName(){
        return name;
    }
    public double getPerimeter() {
        return perimeter = p*r;
    }

    public double getArea() {
        return area = p*r*r;
    }
}
