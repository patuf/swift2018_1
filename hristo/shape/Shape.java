package swift2018_1.hristo.shape;

import javax.xml.bind.SchemaOutputResolver;

public abstract class Shape implements Drawable {

    String name;
    public double perimeter;
    public double area;

    abstract String getName();

    abstract String describeMe();

    public static void main(String[] args) {

        Circle circle = new Circle(4.1);
        Square square = new Square(5.6);

        System.out.println(circle.getCoordinates(6, 7));
        System.out.println(square.describeMe());

    }
    

}
