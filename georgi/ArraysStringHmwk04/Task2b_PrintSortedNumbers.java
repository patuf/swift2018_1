package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        ///////////////  Task2b_PrintSortedNumbers //////////////
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of numbers");
        int n = sc.nextInt();
        int[] unsortArray = new int[n];
        int size = unsortArray.length;

        // read input numbers and write ina array
        System.out.println("enter nums ");
        for (int i = 0; i < size; i++) {
            unsortArray[i] = sc.nextInt();
        }
        // iterate array to make increase order
        for (int i = 0; i < size; i++) {
            int currentNum = unsortArray[i];// right number in array

            for (int j = i + 1; j < size ; j++) {
                int nextNum = unsortArray[j];// left number in array

                if (currentNum > nextNum) {
                    // swap values
                    int temp = unsortArray[i];
                    unsortArray[i] = unsortArray[j];
                    unsortArray[j] = temp;
                }
            }
        }
        // print order array
        for (int i = 0; i < size; i++) {
            System.out.print(unsortArray[i]+" ");
        }
    }
}


