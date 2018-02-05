/*
Задача 0:
Напишете програма с името:
c) Task0c_PrintString, която да чете от стандартния вход един символен низ и да го отпечата на екрана, като всяка буква е на нов ред.
 */

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        char symbol[] = inputString.toCharArray();

        for (char output : symbol) {
            System.out.println(output);
        }
    }
}
