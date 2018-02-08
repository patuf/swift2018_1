import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            nums[i] = num;
        }

        for (int i = n - 1; i >= 0; i--) {

            System.out.print(nums[i] + " ");
        }
    }
}