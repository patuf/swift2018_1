/*
Задача 2:
По въведено от клавиатурата естествено число N и N на брой числа на следващия ред, напишете програма:
a) Task2a_PrintSumOfN, която след приключване на въвеждането отпечатва техния сбор.
 */

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());
        int[] digits = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            digits[i] = in.nextInt();
        }
        int sum = 0;
        for (int varNumbers : digits) {
            sum += varNumbers;
        }
        System.out.println(sum);
    }
}

