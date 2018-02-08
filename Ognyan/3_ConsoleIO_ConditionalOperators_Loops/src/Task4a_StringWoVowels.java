/*
Задача 4:
По въведен низ от клавиатурата, напишете програма с името:
a) Task4a_StringWoVowels, която отпечатва низа но без гласните.
 */

import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String enterWords = in.nextLine();
        String woVowels = enterWords.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(woVowels);
    }
}
