package src.hwk_04;

import java.util.Scanner;

public class task3a_IsPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String reverse = new StringBuffer(word).reverse().toString(); //Тука се общъща стринга

        if (word.equals(reverse)) { // Тук се сравняват двата стринга - оригиналния и обърнатия. Ако са равни -> True

            System.out.print(word + " is Palinrome");
        }
        else
            System.out.print(word + " is not a Palinrome");


    }
}
