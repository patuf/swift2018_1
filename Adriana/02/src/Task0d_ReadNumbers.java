import java.util.Arrays;
import java.util.Scanner;


public class Task0d_ReadNumbers {
    public static int [] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine();

        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = readNumsFromCommandLine();
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}