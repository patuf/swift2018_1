import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number to create a BIG Z: ");
        int height = input.nextInt();
        int width = height-1;
        //creating loop to print stars for height
        for(int i=0; i<height; i++){
            //using if to print stars only in beginning and end
            if(i==0 || i==height-1) {
                System.out.print("* ");
            }
            //another loop to print stars for the width
            for(int j=0; j<width ;j++){
                //using if statement to check if its first or lasr row
                if(i==0 || i==height-1){
                    System.out.print("* ");
                    //another if to check the difference between width and height and print a star there
                }else if(j == width-i){
                    System.out.print("*");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
