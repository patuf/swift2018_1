package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        /////////////////  b) Task1b_PrintMirrorNumber///////////////////////
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int b = sc.nextInt();
        String mirrorNum = "";

        boolean isNegativeNum = false;
        if (b == 0) mirrorNum = "0";


        while (b != 0) {
            if (b % 10 < 0) {
                isNegativeNum = true;// to know is negative num to print after loop sign
                b *= -1;// neutralize sign minus
            }
            mirrorNum += (b % 10);// take residue and storage in string

            b /= 10;// remove last digit
        }                                                          //? true for negative : false for positive
        System.out.println((isNegativeNum) ? (mirrorNum + '-') : (mirrorNum));// ?:print number-: + number

    }
}
