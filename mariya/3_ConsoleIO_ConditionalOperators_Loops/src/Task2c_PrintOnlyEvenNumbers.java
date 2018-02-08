import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            nums[i] = num;
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
