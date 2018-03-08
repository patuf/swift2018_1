package UniqueNumbers;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<Integer>();
        System.out.println("How many numbers will you input: ");
        int counter = input.nextInt();
        System.out.println("Input numbers now: ");
        for (int i=0; i<counter; i++){
            numbers.add(input.nextInt());
        }
        System.out.println("The unique numbers are...");

        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
