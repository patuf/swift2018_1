package Shapes;

public class Rectangle extends Shape implements Drawable{
    protected double x;
    protected double y;
    private String name = "rectangle";
    protected double a;
    protected double b;
    protected double perimeter;
    protected double area;

    Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }

    public String getName(){
        return name;
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean fill(int a) {
        if(a == 1){
            return true;
        }else
            return false;
    }

    @Override
    public int color(int a) {
        return a;
    }

    public void describeMe(){
        System.out.format("The %s, has a perimeter of %.2f and area of %.2f",getName(),getPerimeter(),getArea());
    }
    public double getPerimeter() {
        return perimeter = 2*a + 2*b;
    }

    public double getArea() {
        return area = a*b;
    }
}
