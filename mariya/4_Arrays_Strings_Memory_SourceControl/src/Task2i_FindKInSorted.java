import java.util.Arrays;
import java.util.Scanner;

public class Task2i_FindKInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Arrays.binarySearch(arr, k);
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("NO");
        }
    }
}
