/*
Задача 0:
Напишете програма с името:
Task0d_ReadNNumbers, която да прочита от първия ред на стандартния вход едно число, след което на втория ред,
разделени с интервал, са толкова на брой числа. Програмата да ги отпечата, всяко на нов ред.
 */
import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberValue = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= numberValue ; i++) {
            int printValue = in.nextInt();
            System.out.printf("%d%n", printValue);
        }
    }
}
