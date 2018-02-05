package src.hwk_04;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int[] array = new int[m];

        for (int temp = 0; temp < array.length; temp++) {

            array[temp] = sc.nextInt();
        }

        int sum = 0;

        for (int i : array) {

            sum += i;

        }

        sum = sum / 2;


            System.out.print(sum);
        }
/* Програмата е далече от готова. Единствено сумира целия масив и сбора го дели на две*/

    }


