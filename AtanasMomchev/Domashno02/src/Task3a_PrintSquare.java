import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number to create square: ");
        int height = input.nextInt();
        int width = height;
        //creating a loop to print * for height
        for(int i=0; i<height; i++){
            System.out.print("* ");
            //creating a second loop to add stars to the width
        for(int j=0; j<width-1 ;j++){
            //using if statement to add stars or spaces
            if(i==0 || i==height-1){
            System.out.print("* ");
            }else
                if(j!= width-2){
                System.out.print("  ");
                }else
                    System.out.print("*");
        }
        //using println to go to the next row
            System.out.println();
        }
    }
}
