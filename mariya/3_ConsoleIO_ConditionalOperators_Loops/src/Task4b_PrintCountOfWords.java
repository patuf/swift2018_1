import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int wordCount = 0;

        boolean word = false;
        int endOfLine = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(input.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(input.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }

        System.out.println(wordCount);
    }
}
