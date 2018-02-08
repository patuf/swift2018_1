package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {

        ///////////////////  b) Task0b_ReadArray  ////////////////
        //task is read array from console input

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int size=n;
        if (size < 0) {
            System.out.println(" number is only number>0");
            return;
        }
        int[] readArr = new int[n];
        System.out.println("enter numbers equal to first number you input seprate whit blank ex: if you input 4=>1 2 3 4");

        for (int i = 0; i < n; i++) {
            readArr[i] = sc.nextInt();
            if (i != n - 1) {// n-1 - because array element is count from 0 not from 1
                if(i==0) System.out.print("value of array is ");
                System.out.print( readArr[i] + ",");
                continue;
            }
            System.out.println(readArr[i]);
        }

    }
}
