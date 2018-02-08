package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {


        // b) Read line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you won't Exmaple: Hi!! The time is 12:00.");

        String input = sc.nextLine();// read everything on the line

        System.out.println("The input is " + input);

    }
}
