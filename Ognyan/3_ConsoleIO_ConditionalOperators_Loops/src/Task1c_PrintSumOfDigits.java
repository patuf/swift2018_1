/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
c) Task1c_PrintSumOfDigits, която да отпечатва сбора на цифрите му.
 */

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());
        int sumNumber = 0;
        while (inputNumber > 0) {
            sumNumber += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println(sumNumber);
    }
}
