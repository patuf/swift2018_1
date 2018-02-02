import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number to create a Christmas tree: ");
        int height = input.nextInt();
        int width = height - 1;
        for(int i=0; i<height; i++){
            System.out.print(" ");
        }
    }
}
