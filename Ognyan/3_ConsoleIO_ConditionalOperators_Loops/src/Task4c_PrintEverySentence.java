/*
Задача 4:
По въведен низ от клавиатурата, напишете програма с името:
c) Task4c_PrintEverySentence, всяко изречение на нов ред (предполежете, че едно изречение завършва с .?!)
 */

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputSentence = in.nextLine();

        for (char symbol : inputSentence.toCharArray()) {
            System.out.print(symbol);
            if (symbol == '.' || symbol == '!' || symbol == '?') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
