package src.hwk_03;

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt();

        int[] array = new int[i];

        for(int temp = 0; temp < array.length; temp++){

            array [temp] = sc.nextInt();
        }

        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
