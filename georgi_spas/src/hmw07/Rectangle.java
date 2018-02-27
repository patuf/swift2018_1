package hmw07;

public class Rectangle extends Shape {
    double a;
    double b;

    Rectangle(double a,double b){
     super();
     this.a=a;
     this.b=b;
    }

    @Override
    public double getPerimeter() {
        return (2*a+2*b);
    }

    @Override
    public double getArea() {
        return (a*b);
    }
}
