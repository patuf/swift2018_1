/*
Задача 0:
Напишете програма с името:
b) Task0b_ReadLine, която да прочита цял ред от стандартния вход.
 */

import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String lineInput = in.nextLine();

        System.out.printf("Your input text is : %s.", lineInput);
    }
}
