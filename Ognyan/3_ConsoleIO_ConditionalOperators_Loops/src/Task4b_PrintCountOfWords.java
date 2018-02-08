/*
Задача 4:
По въведен низ от клавиатурата, напишете програма с името:
b) Task4b_PrintCountOfWords, която отпечатва броя думи (една дума е дума, само ако е последователност от символи в диапазона ‘a’ – ‘z’)
 */
import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int word = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                word++;
        }
        System.out.println(word); // не мога да изключа дума с число или символ в нея.
    }
}
