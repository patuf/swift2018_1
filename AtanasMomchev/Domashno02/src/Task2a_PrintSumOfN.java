import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int temp = 0;
        int sum = 0;
        System.out.print("How many numbers will you add: ");
        int broi = input.nextInt();
        System.out.print("Input numbers: ");
        input.nextLine();
        String numbers = input.nextLine();
        //looping through the string to separate the numbers
        for(String part : numbers.split("\\s+")){
        temp = Integer.parseInt(part); //transforming the string to int
        sum += temp; // summing each number
        }
        System.out.print("The sum of the numbers is: " + sum);
    }
}
