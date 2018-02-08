/*
Задача 3:
По въведен низ, напишете програма:
a) Task3a_IsPalindrome, която проверява и извежда true или false,
ако низът е палиндром (чете се от ляво надясно и от дясно наляво по един и същ начин)
 */

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputText = in.nextLine();
        String revText = "";
        int strLength = inputText.length();
        boolean check = true;

        for (int i = strLength - 1; i >= 0; i--) {
            revText += inputText.charAt(i);

            if (inputText.equals(revText)) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println(check);
    }
}
