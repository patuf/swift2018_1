import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter; ");
        int numbers = input.nextInt();
        // creating and initialising array with length numbers
        int[] arr = new int[numbers];
        String growingString = ""; // a string to add the growing string
        String largestGrowingString = ""; // a string to keep the longest growing string
        System.out.print("Ok input them now: ");
        //loop to fill the array
        for (int i = 0; i < numbers; i++) {
            arr[i] = input.nextInt();
        }
        //loop to go trought the array
        for(int i=0;i<arr.length;i++){
            int end = i+1;
            // if statement to change end so it does not prompt error out of bounds
            if(i == arr.length-1) end = arr.length-1;
            //if statement to check if there is a start of growth
            if(arr[i]<arr[end]){
                //loop to go trough the rest of the array
                for(int j=i;j<arr.length;j++) {
                    //changing i =j so it can continue from where we left
                    i=j;
                    int end2 = j + 1;
                    // if statement to change end so it does not prompt error out of bounds
                    if (j == arr.length - 1) end2 = arr.length - 1;
                    //if growth stops break
                    if(arr[j]>arr[end2]) {
                        break;
                    }
                    //putting the numbers that are growing in a string
                    growingString += arr[i] + " ";
                }
            }
            //comparing growing numbers to keep the longest
            if(growingString.length()>largestGrowingString.length()) {
                largestGrowingString = growingString;
            }
            //resetting growing string to keep the next
            growingString = "";
        }
        System.out.println(largestGrowingString);
    }
}
