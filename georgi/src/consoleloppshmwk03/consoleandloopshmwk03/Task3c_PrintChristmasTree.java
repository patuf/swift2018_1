package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("enter number to draw tree letter");
        int n = sc.nextInt();
        byte star = 1;
        for (int i = 0; i < n; i++) {
            if (i < n - 2) {
                for (int j = 0; j < (n * 2) - 1; j++) {
                    if (j < (n / 2 + 2) - i) {
                        System.out.print(" ");
                    } else {
                        for (int k = 0; k < star; k++) {
                            System.out.print('*');
                        }
                        break;
                    }
                }
                star += 2;
                System.out.println();
            } else {
                if (i == n - 2) star = 1;
                for (int j = 0; j < (n * 2) - 1; j++) {
                    if (j < (n / 2 + 2) - (star) / 2) {
                        System.out.print(" ");
                    } else {
                        for (int k = 0; k < star; k++) {
                            System.out.print('*');
                        }
                        break;
                    }
                }
                star += 2;
                System.out.println();
            }
        }
    }
}