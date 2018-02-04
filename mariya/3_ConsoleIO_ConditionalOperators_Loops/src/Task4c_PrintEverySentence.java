import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charArray = input.toCharArray();
        int len = charArray.length;

        String sentence = "";
        for (int i = 0; i < len; i++) {
            if (charArray[i] == '.' || charArray[i] == '?' || charArray[i] == '!') {
                sentence += charArray[i];
                System.out.println(sentence.trim());
                sentence = "";
            }
            else {
                sentence += charArray[i];
            }
        }
    }
}
