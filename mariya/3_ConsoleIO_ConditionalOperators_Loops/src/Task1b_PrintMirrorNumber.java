import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String mirror = new StringBuilder(input).reverse().toString();

        System.out.println(mirror);
    }
}
