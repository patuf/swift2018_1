/*
Задача 2:
По въведено N и N на брой числа, напишете програма:
b) Task2b_PrintSortedNumbers, която да изведе числата наредени по големина.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberValue = Integer.parseInt(in.nextLine());
        int numbers[] = new int[numberValue];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

