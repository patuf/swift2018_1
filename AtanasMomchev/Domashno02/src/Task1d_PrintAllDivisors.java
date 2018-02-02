import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String [] args){
        String divisors = ""; // where the divisors will be inputed
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        /* a loop divides to numbers from 1 to the number and check if there is a remainder,
        if not then it adds it to the divisors*/
        for(int i=1; i<=number;i++){
            if(number%i != 0){
                continue;
            }
            divisors += i + " ";
        }
        System.out.printf("The divisors of %d are %s", number, divisors);
    }
}
