package src.hwk_04;

import java.util.Arrays;
import java.util.Scanner;

public class task2b_PrintSortedNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int [] array = new int [i];

        for (int temp = 0; temp < array.length; temp++) {

            array[temp] = sc.nextInt();

        }

        Arrays.sort(array);

        for (int temp = 0; temp<array.length; temp++){

            System.out.print(array[temp] + " ");
        }

    }
}
