/*
Задача 0:
Напишете програма с името:
b) Task0b_ReadArray, която да създава масив от тип int и да го инициализира със стойности, въведени от стандартния вход.
На първия ред на стандартния вход ще бъде въведено число N, което ще указва броя елементи, които ще бъдат въведени след това.
На втория ред на стандартния вход ще бъдат въведени N на брой числа, разделени с интервал.
Нека създаденият масив да има големина точно N.
Отпечатайте въведените числа, разделени със запетая, на стандартния изход.
 */

import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputValue = Integer.parseInt(in.nextLine());
        int[] numbers = new int[inputValue];

        for (int i = 0; i < inputValue; i++) {
            numbers[i] = in.nextInt();

            if (i != inputValue - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}

