package homework.consoleandloopsHmwk03;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        //////////   b) Task2b_PrintReversedSequence   ///////////

        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number");
        int n = sc.nextInt();
        System.out.println("enter  numbers");

        int [] nums= new int[n];// create size of array to keep numbers;
        System.out.println("enter nums");
        for (int i = 0; i <n ; i++) {
            nums[i]=sc.nextInt();
        }
// print nums
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.print(nums[(i)]+" ");
        }
    }
}
