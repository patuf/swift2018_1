package com.swift.academy.homework03;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String theString = sc.nextLine();

        System.out.print("No vowels: ");
        for (int i = 0; i < theString.length(); i++) {
            switch (theString.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    break;
                default:
                    System.out.print(theString.charAt(i));
            }
        }

        System.out.println("\nCount of words: ");
        int countWords = 0;
        boolean isWord;
        for (String word : theString.split("[.?! ]")) {
            // This initialisation saves us from recognising empty strings as words
            isWord = !word.isEmpty();
            for (int i = 0; i < word.length(); i++) {
                if (    (word.charAt(i) < 'A' || word.charAt(i) > 'Z') &&
                        (word.charAt(i) < 'a' || word.charAt(i) > 'z')) {
                    isWord = false;
                    break;
                }
            }
            if (isWord) {
                countWords++;
            }
        }
        System.out.println(countWords);


        System.out.println("\nEvery Sentence:");
        for (int i = 0; i < theString.length(); i++) {
            switch (theString.charAt(i)) {
                case '.':
                case '!':
                case '?':
                    System.out.println();
                    break;
                default:
                    System.out.print(theString.charAt(i));
            }
        }

        System.out.println("\nEvery sentence 2: ");
        for (String s : theString.split("[.!?]")) {
            System.out.println(s);
        }

        System.out.println("\nSum of numbers: ");
        int sum = 0;
        String currNumber = "";
        for (int i = 0; i < theString.length(); i++) {
            if (theString.charAt(i) >= '0' && theString.charAt(i) <= '9') {
                currNumber = currNumber + theString.charAt(i);
            } else if (!currNumber.isEmpty()) {
                sum += Integer.parseInt(currNumber);
                currNumber = "";
            }
        }
        System.out.println(sum);
    }
}
