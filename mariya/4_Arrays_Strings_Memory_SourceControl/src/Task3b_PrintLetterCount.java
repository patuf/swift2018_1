import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            String letter = Character.toString(input.charAt(i));
            System.out.println(letter);
        }
    }
}
