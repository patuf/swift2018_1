package Shapes;

public class Circle extends Shape implements Drawable{
    private int x;
    private int y;
    private String name = "Circle";
    double r ;
    double p = Math.PI;
    Circle(double r){
        this.r =r;
    }

    public String getName(){
        return name;
    }
    public void describeMe(){
        System.out.format("The %s, has a perimeter of %.2f and area of %.2f",getName(),perimeter,area);
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

    public double getPerimeter() {
        return perimeter = p*r;
    }

    public double getArea() {
        return area = p*r*r;
    }
}
