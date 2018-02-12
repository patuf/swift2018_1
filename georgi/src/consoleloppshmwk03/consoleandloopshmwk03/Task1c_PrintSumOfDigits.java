package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /////////////////  c) Task1c_PrintSumOfDigits///////////////////////


        System.out.println("enter num ");
        int c = sc.nextInt();

        int sum = 0;
        boolean numBellowZero=false;

        while (c != 0) {
            if (c % 10 < 0) numBellowZero= true;
            sum += c % 10;// take last digit and add to sum
            c = c / 10;// remove last add digit;
        }

        System.out.println("Sum of digits num is "+((numBellowZero)?(sum*-1):sum));

    }
}
