/*
Задача 4:
По въведен низ от клавиатурата, напишете програма с името:
Task4d_SumOfNumbersInString
 */
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputSentence = in.nextLine();

        int n = 0;
        int sum = 0;

        for (char alpha : inputSentence.toCharArray()) {
            if ('0' <= alpha && alpha <= '9') {
                n = n * 10 + (alpha - '0');
            } else {
                sum += n;
                n = 0;
            }
        }
        sum += n;
        System.out.println(sum);
    }
}
