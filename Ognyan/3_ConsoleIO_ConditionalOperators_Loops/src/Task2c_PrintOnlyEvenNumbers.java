/*
Задача 2:
По въведено от клавиатурата естествено число N и N на брой числа на следващия ред, напишете програма:
c) Task2c_PrintOnlyEvenNumbers, която след приключване на въвеждането отпечатва само четните числа.
 */
import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());
        int[] digits = new int[inputNumber];

        for (int i = 0; i < inputNumber; i++) {
            digits[i] = in.nextInt();
        }
        for (int evenNumbers : digits) {
            if (evenNumbers % 2 == 0) {
                System.out.printf("%d ", evenNumbers);
            }
        }
    }
}



