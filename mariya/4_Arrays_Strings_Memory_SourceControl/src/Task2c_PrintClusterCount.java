import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int num = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                num = 1;
                if (i == arr.length - 1) {
                    sum += 1;
                }
            } else {
                sum += num;
                num = 0;
            }
        }
        System.out.println(sum);
    }
}
