package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("eneter number of numbsers");
        int size = sc.nextInt();
        int[] arr = new int[size];


        int indx = 0;

        System.out.println("Enter numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int leftSum = arr[0];
        for (int leftSide = 1; leftSide < size; leftSide++) {

            leftSum+=arr[leftSide];
            int rightSum=0;

            for (int rightSide = size - 1; rightSide > leftSide; rightSide--) {


                rightSum += arr[rightSide];

                if (leftSum == rightSum) {
                    indx = leftSide;
                    break;
                }
            }

        }
        System.out.println(indx);

    }
}
