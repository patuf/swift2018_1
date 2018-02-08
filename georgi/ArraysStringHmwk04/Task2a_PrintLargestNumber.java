package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of numbers");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int size = nums.length;

        // read input numbers and write ina array
        System.out.println("enter nums ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];// take first item for max
        // iterate to find max number
        for (int i = 1; i < size; i++) {
            int currentNum = nums[i];
            if (currentNum > max) {
                max = currentNum;
            }
        }
        System.out.println("Max number is " + max);


    }
}
