package Shapes;

import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Picture p = new Picture();
        System.out.println("Input figures for the picture");
        end:
    while (true){
        String str = input.next();
        str = str.toLowerCase();

        switch (str){
            case ("end"):break end;
            case ("circle"):
                p.addCircle(input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
                break;
            case ("rectangle"):
                p.addRectangle(input.nextDouble(),input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
                break;
            case ("square"):
                p.addSquare(input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
                break;
                default:
                    System.out.println("No such figure");
        }
    }
            p.drawPicture();
    }

    Shape[] d = new Shape[100];
    int dCounter = 0;
    public void addCircle(double r, int x, int y, int fill, int color){
        d[dCounter++] = new Circle(r,x,y,fill,color);
    }

    public void addRectangle(double a, double b, int x, int y, int fill, int color){
        d[dCounter++] = new Rectangle(a,b,x,y,fill,color);
    }

    public void addSquare(double a, int x, int y, int fill, int color){
        d[dCounter++] = new Square(a,x,y,fill,color);
    }

    public void drawPicture(){
        if(dCounter ==0) return;
        for(int i=0;i<dCounter;i++) {
            d[i].describeMe();
            System.out.printf("The coordinates are %d and %d, the circle is %d, with color %d %n",
                    d[i].getX(),d[i].getY(),d[i].getFill(),d[i].getColor());
        }
    }

    public int getdCounter() {
        return dCounter;
    }
}