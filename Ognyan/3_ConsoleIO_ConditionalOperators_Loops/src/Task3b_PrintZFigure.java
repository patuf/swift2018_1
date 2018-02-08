/*
Задача 3:
По въведено число N от клавиатурата, напишете програма с името:
b) Task3b_PrintZFigure, която отпечатва голяма буква Z с дължина на всяка отсечка N, използвайки знака *.
 */
import java.util.Scanner;

public class Task3b_PrintZFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());

        for (int row = 1; row <= inputNumber; row++) {
            System.out.println();
            if (row == 1 || row == inputNumber) {
                for (int j = 1; j <= inputNumber; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = 0; k <= inputNumber - row; k++) {
                    if (k == (inputNumber - row)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }
}
