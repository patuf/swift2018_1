import java.util.Scanner;

public class Task1c_PrintSumofDigits {
    public static void main(String[]args){
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        String number = input.next();
        // using a loop and a parse to transform every digit of the string and pass it to n then add it to sum
        for(int i=0; i<number.length();i++){
            int n = Integer.parseInt(number.substring(i,i+1));
            sum += n;
        }
        System.out.println("The sum of the digits in the number is - " + sum);
    }
}
