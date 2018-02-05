/*
Задача 2:
По въведено от клавиатурата естествено число N и N на брой числа на следващия ред, напишете програма:
b) Task2b_PrintReversedSequence, която след приключване на въвеждането отпечатва числата в обратен ред.
 */

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());
        int[] digits = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            digits[i] = in.nextInt();
        }
        while (inputNumber > 0) {
            inputNumber--;
            System.out.printf("%d ", digits[inputNumber]);
        }
    }
}
