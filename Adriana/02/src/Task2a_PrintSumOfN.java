import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int chisla [] = new int [n];
        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        int sum = IntStream.of(chisla).sum();
        System.out.print("The sum is: " + sum);

    }
}
