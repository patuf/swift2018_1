/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
b) Task1b_PrintMirrorNumber, която да отпечатва огледалното му число.
 */

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());

        while (inputNumber > 0) {
            System.out.print(inputNumber % 10);
            inputNumber /= 10;
        }
    }
}
