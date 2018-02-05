import java.util.Scanner;

public class Task0_ReadArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to put in the array: ");
        int numbers = input.nextInt();
        //creating and initialising the array with length numbers
        int [] arrayNumbers = new int[numbers];
        System.out.println("Input them now: ");
        //creating a loop to input numbers in the array and printing them
        for (int i=0; i<numbers;i++){
            //inputting each number in the array
            arrayNumbers[i] = input.nextInt();
            //printing each number
            System.out.print(arrayNumbers[i]);
            //if number is not last print ,
            if(i != arrayNumbers.length-1 ) System.out.print(",");
        }
    }
}
