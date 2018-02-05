import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            sumFirstHalf += arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                sumSecondHalf += arr[j];
            }

            if (sumFirstHalf == sumSecondHalf) {
                System.out.println(i);
                break;
            }

            sumSecondHalf = 0;
        }
    }
}
