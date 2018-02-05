/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
e) * Task1e_IsPrime, която да отпечатва true, ако числото е просто, иначе false.
 */
import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Просто число x => x/x и x/1;

        int inputNumber = Integer.parseInt(in.nextLine());
        int divider = 2;
        boolean isPrime = true;
        int maxDivider = (int) Math.sqrt(inputNumber);
        /*
        ако имаме делител, по-голям от Math.sqrt(inputNumber), то би трябвало num да има и друг делител,
        който е обаче по-малък от Math.sqrt(inputNumber) и затова няма смисъл да проверяваме числата, по-големи от Math.sqrt(inputNumber)
         */

        while (isPrime && (divider <= maxDivider)) {
            if (inputNumber % divider == 0) {
                isPrime = false;
            }
            divider++;
        }
        System.out.println(isPrime);
    }
}
