import java.util.Scanner;
import java.util.Arrays;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
