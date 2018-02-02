import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt(); // this is where the number goes
        String num = Integer.toString(number); // the number is transformed to string
        // using charAt to print only the first char of the string
        System.out.printf("First digit of number is: %s",num.charAt(0));
    }
}
