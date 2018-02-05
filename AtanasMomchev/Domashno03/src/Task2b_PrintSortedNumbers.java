import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int count = input.nextInt();
        System.out.println("Ok input numbers now: ");
        //creating and initialising the array with length count
        int [] arr = new int[count];
        //loop to fill the array
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        //method to sort the array
        Arrays.sort(arr);
        System.out.print("I sorted them for you: ");
        //loop to print out the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
