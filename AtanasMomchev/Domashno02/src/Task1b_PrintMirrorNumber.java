import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        String mirror = Integer.toString(number);//converting integer to string
        //using a loop and charAt to print the symbols from back to front
        for(int i=mirror.length(); i>0;i--){
            System.out.print(mirror.charAt(i-1));
        }
    }
}
