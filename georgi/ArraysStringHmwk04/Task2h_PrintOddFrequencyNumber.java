package homework.ArraysStringHmwk04;

import java.util.Arrays;
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");

        int[] arr =new int[sc.nextInt()] ;// read size directly
        // input numbers
        System.out.println("fil array whit numbers");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 1;
        int maxOddCount = 0;
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                int nextNum = arr[j];

                if (currentNum == nextNum) {
                    count++;

                } else {
                    if (count % 3 == 0) {
                        indx = i;
                    }
                    i = j - 1;
                    count = 1;

                    break;
                }
                if (j == arr.length-1) {
                    if (count % 3 == 0) {
                        indx = i;
                    }
                }
            }
        }

        System.out.println(arr[indx]);

    }
}
