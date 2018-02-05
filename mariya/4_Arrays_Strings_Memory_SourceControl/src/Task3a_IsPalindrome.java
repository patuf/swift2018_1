import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        boolean isPalindrome = reversed.equals(input);

        System.out.println(isPalindrome);
    }
}
