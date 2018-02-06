package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Тask1b_PrintMatrix {
    public static void main(String[] args) {
        /////////////////////// print matrix ////////////////
        /*    b) example
        1 8 9  16
        2 7 10 15
        3 6 11 14
        4 5 12 13
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num for row");
        int n = sc.nextInt();
        System.out.println("enter num for col");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];// initialize
        // fill matrix on cols
        int count = 1;
        for (int row = 0; row < arr[0].length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (row % 2 == 0) {
                    arr[col][row] = (row * arr.length) + col + count;

                } else {
                    arr[col][row] = (row * arr.length) + col + --count;
                    --count;
                }

            }
            count += 4;
        }
        // print matrix
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();

        }

    }
}


