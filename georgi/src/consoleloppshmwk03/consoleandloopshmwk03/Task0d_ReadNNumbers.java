package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // d) ReadNums  and print

        System.out.println("enter number ");
        int n = sc.nextInt();
        System.out.println("enter numbers whit first digit you input ex: 1 2 3 4 5");
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            System.out.println(a);
        }

    }
}


