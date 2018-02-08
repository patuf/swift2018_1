package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        /////////////////a)Task1a_PrintFirstDigit/////////////

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer num:");

        int a = sc.nextInt();// storage input num
        int baseNum = 10;// base is 1O for the decimal number system to take place value digit we divide.
        int fDigit = 0;// keep first digit
        if (a == 1 || a == -1) fDigit = a;// if input is 1 fDigit must be 1.Otherwise will go after loop and print 0;
        // Ex: 10(0)/10=10(we remove one digit); => continue divide=> 10/10=1 we receive first digit.
        while (a > 1 || a < 0) {
            a = a / 10;// remove one digit
            if (a == 0) break;//check is number equal to zero. We must stop loop before rewrite new value equal to zero.
            fDigit = a;// save current num

        }
        System.out.println(fDigit);// print last digit
    }
}
