package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task1d_PrintMatrix {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        int rowStartIdx = 0;
        int rowEndIdx = m - 1;
        int colStartIdx = 0;
        int colEndIdx = n - 1;
        int counter = 1;
        while (counter <= n * m) {
            for (int i = rowStartIdx; i <= rowEndIdx && counter <= n * m; i++) {
                array[colStartIdx][i] = counter;
                counter++;
            }
            colStartIdx++;
            for (int i = colStartIdx; i <= colEndIdx && counter <= n * m; i++) {
                array[i][rowEndIdx] = counter;
                counter++;
            }
            rowEndIdx--;
            for (int i = rowEndIdx; i >= rowStartIdx && counter <= n * m; i--) {
                array[colEndIdx][i] = counter;
                counter++;
            }
            colEndIdx--;

            for (int i = colEndIdx; i >= colStartIdx && counter <= n * m; i--) {
                array[i][rowStartIdx] = counter;
                counter++;
            }
            rowStartIdx++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
    }

}

