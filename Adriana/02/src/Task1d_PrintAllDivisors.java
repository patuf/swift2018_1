import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int number = sc.nextInt();
        System.out.println("All divisors of " + number + " are:");
        for (int i = 1; i <= number; i++){
            if (number%i == 0){
                System.out.print(i + " ");
            }
        }

        }
}
