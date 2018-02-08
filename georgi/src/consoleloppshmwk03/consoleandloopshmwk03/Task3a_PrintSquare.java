package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {
        ////// a) Task3a_PrintSquare /// // //
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to draw Square");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // print first line square and last
                for (int j = 0; j < n; j++) {

                    if (i == 0 || i == n - 1) {
                        System.out.print('*');
                        System.out.print(" ");
                    } else {
                        if (i < n - 2) {
                            System.out.print('*');
                        }
                    }
                }
            } else {
                // print middle part
                for (int j = 0; j < ((n * 2) - 1); j++) {
                    if (j == 0) {
                        System.out.print('*');// print begin line and end line
                    } else {
                        System.out.print(" ");// print between stars spaces
                    }
                    if (j == ((n * 2) - 3))
                        System.out.print('*');
                }
            }

            System.out.println();
        }

    }
}
