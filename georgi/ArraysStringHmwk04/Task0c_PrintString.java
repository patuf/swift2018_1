package homework.ArraysStringHmwk04;

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ///////////////////  c) Task0c_PrintString  ////////////////
        System.out.println("enter word");

        // read from scanner string and print every letter is on new line
        String input=sc.nextLine();// read string and save in variable


        for (int i = 0; i <input.length() ; i++) {
            System.out.println(input.charAt(i));
        }

    }
}
