import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxLength = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int finalSum = 0;
        int temp = 0;
        String tempArr = "";
        String longestArr = "";

        for (int i = 0; i <= arr.length - maxLength; i++) {
            for (int j = i; j < maxLength + i; j++) {
                temp += arr[j];
                tempArr += arr[j] + " ";
            }
            if (temp > finalSum) {
                finalSum = temp;
                longestArr = tempArr;
            }
            temp = 0;
            tempArr = "";
        }
        System.out.println(longestArr);
    }
}
