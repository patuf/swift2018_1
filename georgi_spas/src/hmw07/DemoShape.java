package hmw07;

public class DemoShape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle_1 = new Rectangle(1, 2);
        Rectangle rectangle_2 = new Rectangle(2, 2);
        Square square = new Square(2);
        System.out.println("circel perimeter");
        System.out.println(circle.getPerimeter());
        System.out.println("circel perimeter");
        System.out.println(circle.getArea());
        System.out.println("rectangle perimeter");
        System.out.println(rectangle_1.getPerimeter());
        System.out.println("rectangle area");
        System.out.println(rectangle_1.getArea());
        System.out.println("rectangle perimeter");
        System.out.println(rectangle_2.getPerimeter());
        System.out.println("rectangle area");
        System.out.println(rectangle_2.getArea());
        System.out.println("square perimeter");
        System.out.println(square.getPerimeter());
        System.out.println("square perimeter");
        System.out.println(square.getArea());
        Shape shape = new Shape();
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
