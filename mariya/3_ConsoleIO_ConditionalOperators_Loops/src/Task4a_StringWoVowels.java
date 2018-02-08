import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        int len = charArray.length;

        String woVowels = "";

        for (int i = 0; i < len; i++) {
            if (charArray[i] != 'a' && charArray[i] != 'e' && charArray[i] != 'i' && charArray[i] != 'o'
                    && charArray[i] != 'u') {
                woVowels += charArray[i];
            }
        }

        System.out.println(woVowels);
    }
}
