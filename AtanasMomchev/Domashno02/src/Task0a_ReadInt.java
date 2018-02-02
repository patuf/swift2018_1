import java.util.Scanner;
public class Task0a_ReadInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number - ");
        int number = input.nextInt(); // nextInt for only one integer
         number += 1; // adding one to number
        System.out.printf("Your number was one less then %d", number);
    }
}
