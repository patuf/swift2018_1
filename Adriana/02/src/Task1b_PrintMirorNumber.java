import java.util.Scanner;

public class Task1b_PrintMirorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        String number = sc.nextLine();
        String reverse = new StringBuilder(number).reverse().toString();
        System.out.println("The mirror number is" + " " + reverse);


    }
}
