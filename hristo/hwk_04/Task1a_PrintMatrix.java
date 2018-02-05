package src.hwk_04;

import java.util.Scanner;

public class Task1a_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int row = a;
        int col = a;

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                matrix[i][j] = (j + 1) * col - (col -1) + i;

                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }
    }
}
