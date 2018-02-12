package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {

        //////////   c) Task2c_PrintOnlyEvenNumbers   ///////////
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {

            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }

        }
    }
}
