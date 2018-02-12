import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String number = sc.nextLine();
        System.out.println("The first digit is" + " " + number.charAt(0));
    }

}
