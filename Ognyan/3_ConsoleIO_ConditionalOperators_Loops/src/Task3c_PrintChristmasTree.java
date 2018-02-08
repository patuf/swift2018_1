/*
Задача 3:
По въведено число N от клавиатурата, напишете програма с името:
c) Task3c_PrintChristmasTree, която отпечатва елхичка с височина N, използвайки знака *.
„Поставката“ е винаги с височина 1 и дължина 3, а стъблото с височина 1 и дължина 1.
Всеки ред на „короната“ е с дължина 2 звезди повече от предходния, като първия е с дължина 1 звезда.
 */

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int enterValue = Integer.parseInt(in.nextLine());

        for (int i = 0; i < enterValue - 2; i++) {
            for (int j = 0; j <= enterValue - 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int d = 0; d <= enterValue - 4; d++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int e = 0; e <= enterValue - 5; e++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }
}
