package hmw07.shapeexersicelesson.exersice2_shape_drawable;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.SortedMap;

public class Picture {
  private  Drawable[] drawables;

  private static int countPictures = 10;

    Picture() {

        this.drawables = new Drawable[countPictures];


    }

    void drawPicture(Shape shape, int x, int y, int isFill, int color) {

        // set charactersitics
        shape.setCoordinate(x, y);
        shape.fillShape(isFill);
        shape.setColor(color);


// add shape
        if (countPictures > 0) {
            drawables[drawables.length - countPictures--] = shape;
            return;
        }
        System.out.println("no place to draw");
         drawIt();


    }


    public void drawIt() {
        System.out.println("You draw next 10 figures");

        for (int i = 0; i < drawables.length; i++) {
            System.out.println(((Shape) drawables[i]).describeMe());
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Picture pictures=new Picture();
        while (true) {
            System.out.println("Enter shape to draw");String shapeName = sc.next();

            switch (shapeName.toUpperCase()) {

                case "CIRCLE":
                    System.out.println("Enter  radius:");
                    System.out.println("Enter coordinate x and y");
                    System.out.println("Enter 0 if you won't shape to be empty or 1 to be fill in");
                    System.out.println("Enter 0 to be transperant or 1 to be whit color");

                    pictures.drawPicture(new Circle(sc.nextDouble(),"Circle"),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                    break;
                case "RECTANGLE":
                    System.out.println("Enter  side a  and side b:");
                    System.out.println("Enter coordinate x and y");
                    System.out.println("Enter 0 if you won't shape to be empty or 1 to be fill in");
                    System.out.println("Enter 0 to be transperant or 1 to be whit color");

                    pictures.drawPicture(new Rectangle(sc.nextDouble(),sc.nextDouble(),"Rectangle"),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                    break;
                case "SQUARE":
                    System.out.println("Enter  side:");
                    System.out.println("Enter coordinate x and y");
                    System.out.println("Enter 0 if you won't shape to be empty or 1 to be fill in");
                    System.out.println("Enter 0 to be transperant or 1 to be whit color");
                            double a=sc.nextDouble();
                    pictures.drawPicture(new Square(a,a,"Square"),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                    break;
            }
                 //   pictures.drawIt();
        }
    }

}
