package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /////////////////  d) Task1d_PrintAllDivisors ///////////////////////

        System.out.println("enter number to find his divisors");
        int divide = sc.nextInt();
        // positive nums divisor
        for (int divisor = 1; divisor <= divide; divisor++) {
            if (divide % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
        // negative nums divisor
        for (int divisor = -1; divisor >= divide; divisor--) {
            if (divide % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}
