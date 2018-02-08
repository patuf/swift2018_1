import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String even = "";
        System.out.print("How many numbers will you input: ");
        int broi = input.nextInt();
        System.out.print("Input numbers: ");
        input.nextLine();
        String numbers = input.nextLine();
        //looping through the string
        for(String part : numbers.split("\\s+")){
            int temp;
            temp = Integer.parseInt(part);//transforming the from string to int
            // if it modulus two is diff then 0 going to next iteration
            if(temp%2 != 0){
                continue;
            }else
            even += temp + " "; //adding then even numbers to a string
        }
        System.out.print("The even numbers are: " + even);
    }
}
