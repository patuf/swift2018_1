/*
Задача 3:
По въведено число N от клавиатурата, напишете програма с името:
a) Task3a_PrintSquare, която отпечатва квадрат със страна N, използвайки знака *.
 */
import java.util.Scanner;

public class Task3a_PrintSquare {
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
                for (int k = 1; k <= inputNumber; k++) {
                    if (k == 1 || k == inputNumber) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }
}
