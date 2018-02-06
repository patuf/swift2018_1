package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array to fill numbers");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int size = arr.length;
        System.out.println("fill numbers");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        int maxLenght = 0;
        int startSequence = 0;
        int endSequence = 0;

        for (int i = 0; i < size-1; i++) {
            int currentLenght = 1;
            for (int j = i; j < size ; j++) {
                int fItem = arr[j];
                int secItem = arr[j + 1];

                if (fItem < secItem) {

                    currentLenght++;



                } else {

                    if (currentLenght > maxLenght) {
                        maxLenght = currentLenght;
                        startSequence = i;// take begin sequence
                        endSequence=j+1;

                    }

                    i = j;
                    currentLenght = 1;

                    break;
                }
                if (currentLenght > maxLenght) {
                    maxLenght = currentLenght;
                    startSequence = i;// take begin sequence
                    endSequence=j+1;
                }

            }

        }
        for (int i = startSequence; i <=endSequence; i++) {
            System.out.print( arr[i]+" ");
        }

    }
}
