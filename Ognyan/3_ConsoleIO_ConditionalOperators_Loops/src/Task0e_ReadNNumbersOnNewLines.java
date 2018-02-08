/*
Задача 0:
Напишете програма с името:
e) Task0e_ReadNNumbersOnNewLines, която да прочита от първия ред на стандартния вход едно число,
след което на следващите толкова на брой реда да има по едно число.
Програмата да ги отпечатва на един ред, разделени с интервал, след приключване на въвеждането
 */

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberValue = Integer.parseInt(in.nextLine());
        String printValue = " ";

        for (int i = 1; i <= numberValue ; i++) {
            int inputValue = Integer.parseInt(in.nextLine());
            printValue += inputValue + " ";
        }
        System.out.printf("%s", printValue);
    }
}
