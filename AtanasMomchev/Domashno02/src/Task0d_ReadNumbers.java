import java.util.Scanner;

public class Task0d_ReadNumbers {
    public static void main(String [] args) {
        int count; // this will contain how many numbers they will input
        String numbers; // this will contain the inputted numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        count = input.nextInt();
        System.out.print("Ok input them now with a space between: ");
        input.nextLine();
        numbers = input.nextLine();
        // using a for loop to loop trough the string, and using split to use the space as a separator
       for(String part : numbers.split("\\s+")){
           System.out.println(part);
       }
    }
}
