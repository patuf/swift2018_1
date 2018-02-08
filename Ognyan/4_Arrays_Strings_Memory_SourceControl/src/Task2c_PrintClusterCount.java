/*
Задача 2:
По въведено N и N на брой числа, напишете програма:
c) Task2c_PrintClusterCount, която да изведе броя на клъстерите
(клъстер е последователност от елементи с един или повече идентични елемента).
 */

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputValue = in.nextInt();
        int[] numbers = new int[inputValue];
        int sum = 0;
        int digit = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                digit = 1;
                if (i == numbers.length - 1) {
                    sum += 1;
                }
            } else {
                sum += digit;
                digit = 0;
            }
        }
        System.out.println(sum);
    }
}
