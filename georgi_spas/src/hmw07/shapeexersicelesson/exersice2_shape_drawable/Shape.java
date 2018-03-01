package hmw07.shapeexersicelesson.exersice2_shape_drawable;

public abstract class Shape implements Drawable{
    // this part is from first exersice task
    String nameShape;

    Shape(String name){
        this.nameShape=name;
    }
    // to calculate perimetar
    public double getPerimeter() {
        System.out.println("no data because don't know shape");
        return 0;// don't know shape
    }

    public double getArea() {
        System.out.println("no data because don't know shape");
        return 0;
    }


    // new part from exercise 2

    //add methods
    protected abstract String getName();

    protected String describeMe() {
       return String.format("My name is %s. My area and perimeter are %.2f,%.2f .", getName(), getArea(),getPerimeter());
    }


}
