import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String command = sc.nextLine();
        String encodeString = "";
        String decodeString = "";

        for (int i = 0; i < input.length(); i++) {
            char initialLetter = input.charAt(i);
            char encodeLetter = initialLetter;
            char decodeLetter = initialLetter;

            if ((initialLetter >= 'a' && initialLetter <= 'z') || (initialLetter >= 'A' && initialLetter <= 'Z')) {
                encodeLetter += 1;
                decodeLetter -= 1;
                encodeString += encodeLetter;
                decodeString += decodeLetter;
            } else {
                encodeString += encodeLetter;
                decodeString += decodeLetter;
            }
        }
        if (command.startsWith("encode")) {
            System.out.println(encodeString);
        } else if (command.startsWith("decode")) {
            System.out.println(decodeString);
        }
    }
}
