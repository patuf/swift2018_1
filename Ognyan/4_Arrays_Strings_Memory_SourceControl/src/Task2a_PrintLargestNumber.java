/*
Задача 2:
По въведено N и N на брой числа, напишете програма:
Task2a_PrintLargestNumber, която да изведе най-голямото число.
 */

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberValue = Integer.parseInt(in.nextLine());
        int numbers[] = new int[numberValue];
        int maxValue = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);
    }
}
