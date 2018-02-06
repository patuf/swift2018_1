/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
d) Task1d_PrintAllDivisors, която да отпечатва всичките му делители.
 */

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
