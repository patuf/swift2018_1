/*
Задача 0:
Напишете програма с името:
a) Task0a_ReadInt, която да прочита едно единствено число от стандартния вход и да отпечата числото, увеличено с 1.
 */

import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberInput = Integer.parseInt(in.next());

        System.out.println(++numberInput);
    }
}
