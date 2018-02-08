import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter; ");
        int numbers = input.nextInt();
        // creating and initialising array with length numbers
        int[] arr = new int[numbers];
        int sumA = 0;
        int sumB = 0;
        boolean equals = false;
        System.out.print("Ok input them now: ");
        //loop to fill the array
        for (int i = 0; i < numbers; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sumA += arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                sumB += arr[j];
                }
            if (sumA == sumB) {
                System.out.format("On index %d the sum of both sides are euqal!",i);
                equals=true;
                break;
            }
            sumB = 0;
        }
        if (!equals) System.out.print("NO");
    }
}
