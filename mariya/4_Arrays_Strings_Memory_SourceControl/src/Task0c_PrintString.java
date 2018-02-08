import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        int len = charArray.length;

        for (int i = 0; i < len; i++) {
            System.out.println(charArray[i]);
        }
    }
}