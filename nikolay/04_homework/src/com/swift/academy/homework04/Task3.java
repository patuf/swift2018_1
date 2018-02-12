package com.swift.academy.homework04;

public class Task3 {
    public static void main(String[] args) {

        final String s = "zalenaFANELAZ";

        // ----------- //
        // Palindromes //
        // ----------- //
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.printf("Palindrome?: %b%n", isPalindrome);

        // -------------//
        // Letter count //
        // -------------//
        final int ALPHABET_COUNT = 26;
        int[] letters = new int[ALPHABET_COUNT];
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                letters[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                letters[c - 'a']++;
            }
        }

        System.out.println("Letter counts: ");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 0)
                System.out.printf("%c (%d)%n", 'a' + i, letters[i]);
        }

        // ------------- //
        // Caesar cipher //
        // ------------- //
        System.out.println("Caesar cipher: ");
        boolean encode = true;
        int cipher = encode ? 1 : -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c + cipher > 'Z')
                    System.out.print('A');
                else if (c + cipher < 'A')
                    System.out.print('Z');
                else
                    System.out.printf("%c", c + cipher);
            } else if (c >= 'a' && c <= 'z') {
                if (c + cipher > 'z')
                    System.out.print('a');
                else if (c + cipher < 'a')
                    System.out.print('z');
                else
                    System.out.printf("%c", c + cipher);
            }
        }
    }
}
