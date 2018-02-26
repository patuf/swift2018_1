package Shapes;

public class Circle extends Shape implements Drawable{
    private int x;
    private int y;
    private int color;
    private String name = "Circle";
    private boolean fill;
    double r ;
    double p = Math.PI;
    Circle(double r){
        this.r =r;
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
    public void fill(int a) {
        if(a == 1){
            fill = true;
        }else
        fill = false;
    }

    public boolean isFill() {
        return fill;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void color(int a) {
        color = a;
    }

    @Override
    public int getColor() {
        return color;
    }

    public double getPerimeter() {
        return perimeter = p*r;
    }

    public double getArea() {
        return area = p*r*r;
    }
}
