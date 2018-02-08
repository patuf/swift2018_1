package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {
        ///////////////////  Print matrix  ////////////////
        /*    a) example
        1 5 9  13
        2 6 10 14
        3 7 11 15
        4 8 12 16
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for row");
        int n = sc.nextInt();// size of array
        System.out.println("enter number for row");
        int m = sc.nextInt();// size of array
        int[][] arr = new int[n][m];// initialize

        // fill matrix on cols
        int count = 1;
        for (int row = 0; row < arr[0].length; row++) {
            for (int col = 0; col < arr.length; col++) {

                arr[col][row] = (row * arr.length) + col + count;
            }

        }
        // print matrix
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }
        System.out.println();
    }
}
