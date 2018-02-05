package src.hwk_03;

import java.util.Scanner;

public class Task2b_PrintReverceSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int [] ar = new int[i];

        for (int m = 0; m < i; m++){

            ar [m] = sc.nextInt();

        }

        for (int m = i-1; m >= 0; m--) {
            System.out.print(ar[m] + " ");
        }
        }
    }

