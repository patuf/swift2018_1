import java.util.Scanner;

public class Task2g_LargestSumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxLength = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int largestSum = 0;
        String temp = "";
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                temp += arr[j] + " ";
                sum += arr[j];
                if (sum > largestSum) {
                    largestSum = sum;
                    result = temp;
                }
            }
            sum = 0;
            temp = "";
        }
        System.out.println(result);
    }
}
