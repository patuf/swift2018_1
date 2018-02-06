import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();

        System.out.println(input.equals(reverse));

    }
}
