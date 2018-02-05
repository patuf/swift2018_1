import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter; ");
        int numbers = input.nextInt();
        System.out.print("And how long will the sequence be: ");
        int K = input.nextInt();
        //creating and initialising array with length numbers
        int [] arr = new int[numbers];
        int sum = 0;
        System.out.print("Input numbers now: ");
        //loop to fill the array
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0; i<K;i++){

        }
    }
}
