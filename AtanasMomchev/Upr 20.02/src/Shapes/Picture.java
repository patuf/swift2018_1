package Shapes;

import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Picture p = new Picture();
        Drawable[] drawables = new Drawable[]{new Circle(2),new Square(5),new Rectangle(3,6)};

        for (int i=0;i<drawables.length;i++){
            System.out.println("Input parameters for figure coordinate x and y, int for color, 1 for fill 0 for not");
            p.setParameters(drawables[i],input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
            p.drawPicture(drawables[i]);
        }
    }
    public void setParameters(Drawable figure, int x, int y, int color,int fill){
    figure.setCoordinates(x,y);
    figure.color(color);
    figure.fill(fill);
    }
    public void drawPicture(Drawable figure){
        System.out.print("x = " + figure.getX() + " ");
        System.out.print("y = " + figure.getY() + " ");
        System.out.print("the color is " + figure.getColor() + " ");
        System.out.print("fill? " + figure.isFill());
        System.out.println();
    }
}
