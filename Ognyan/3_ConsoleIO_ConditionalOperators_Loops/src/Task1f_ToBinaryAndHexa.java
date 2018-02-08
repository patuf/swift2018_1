/*
Задача 1:
По въведено число от клавиатурата, напишете програма с името:
f) ** Task1f_ToBinaryAndHexa, която да отпечатва двуичното и шестнадесетичното му представяне на два отделни реда.
 */

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNumber = Integer.parseInt(in.nextLine());
        int divider = 2;
        int number = inputNumber;
        String result = "";

        while(number != 0){
            result = number % divider + result;
            number /= divider;
        }
        System.out.println(result);

        divider = 16;
        number = inputNumber;
        result = "";

        while(number != 0){
            int digit = number % divider;
            if (digit < 10) {
                result = digit + result;
            } else {
                result = (char)('A' + (digit - 10)) + result;
            }
            number /= divider;
        }
        System.out.println(result);
    }
}
