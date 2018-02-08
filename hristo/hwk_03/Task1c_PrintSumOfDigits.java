package src.hwk_03;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        int i =in.nextInt();

        int sum = 0;

        while ( i != 0 ) {

            sum = sum + i % 10;
            i = i / 10;

        }

        System.out.println(sum);


        }


    }
