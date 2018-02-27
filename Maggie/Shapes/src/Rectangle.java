public class Rectangle extends Circle{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double circumference() {
        return 2*width+2*height;
    }
}



