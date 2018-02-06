/*
Задача 0:
Напишете програма с името:
c) Task0c_ReadAge, която да прочита едно число от стандартния вход и ако това са годините на един човек да отпечатва
 дали човекът е пълнолетен или не (дали е поне на 18).
 */

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you're age: ");
        int ageValue = Integer.parseInt(in.nextLine());

        if (ageValue <= 0) {
            System.out.println("Please enter a valid age...");
        } else if (ageValue < 18) {
            System.out.println("You're under 18!");
        } else {
            System.out.println("You're an adult!");
        }
    }
}
