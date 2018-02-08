package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        ////// b) Task3b_PrintZFigure /// // //
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to draw Z letter");
        int  n = sc.nextInt();
        byte step = (byte) (2 * n - 2);// to count diagonal stars offsets on new line
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

                for (int j = 0; j < n * 2 - 1; j++) {
                    if (j == step-2) {
                        System.out.print('*');
                        step-=2;// remove step to move stars diagonal

                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
