import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String result = "";
        String temp = "";
        int limit = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                temp += arr[i] + " ";
                if (i == arr.length - 2) {
                    temp += arr[i + 1] + " ";
                    if (temp.length() > limit) {
                        result = temp;
                        limit = temp.length();
                    }
                }
            }
            else {
                temp += arr[i] + " ";
                if (temp.length() > limit) {
                    result = temp;
                    limit = temp.length();
                }
                temp = "";
            }
        }

        System.out.println(result);
    }
}
