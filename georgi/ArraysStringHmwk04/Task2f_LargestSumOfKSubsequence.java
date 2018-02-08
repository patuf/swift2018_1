package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size array");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter number for consecutive items");
        int k = sc.nextInt();
        int size = arr.length;

        System.out.println("enter numbers");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }


        int sum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;



        for (int i = 0; i < size; i++) {

            sum = 0;

            for (int j = i; j < size; j++) {
                sum += arr[j];

                if (sum > maxSum) {
                    if (j-i==k) {
                        maxSum = sum;
                        start = i;
                        end = j;

                    }

                }
            }
        }

        for (int i = start; i <end; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
