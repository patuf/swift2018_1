import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        System.out.println("How many numbers will you enter: ");
        int count = input.nextInt();
        System.out.println("Ok input numbers now: ");
        // creating and initialising the array with length count
        int [] arr = new int[count];
        //loop to fill the array
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
            // if statement to compare inputted numbers and put the largest in the int largest Number
            if(arr[i]>largestNumber){
                largestNumber = arr[i];
            }
        }
        System.out.format("The biggest number you entered is: %d",largestNumber);
    }
}
