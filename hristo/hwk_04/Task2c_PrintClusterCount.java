package src.hwk_04;

import java.util.Objects;
import java.util.Scanner;

public class Task2c_PrintClusterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int[] array = new int[m];

        for (int temp = 0; temp < array.length; temp++) {

            array[temp] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if ((i + 1) != j) ;

                    else if (array[i] == array[j]) {

                        count++;
                    }
/* Програмата работи само при въвеждане на две еднакви числа. При повече ги смята и тях за повторение*/

            }

        }
        System.out.print(count + " ");
    }
}

