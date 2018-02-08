/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
a) Task1a_PrintFirstDigit, която да отпечатва първата му цифра.
 */
import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());

        int firstDigit = 1;
        for (int i = 10; i < inputNumber; i *= 10) {
            firstDigit = inputNumber / i;
        }
        System.out.println(firstDigit);
    }
}
