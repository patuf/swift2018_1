

import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int sum = 0;

        for (int a = 0; a < i; a++ ){


            sum= sum + sc.nextInt();
        }

        System.out.print(sum);

    }
}



