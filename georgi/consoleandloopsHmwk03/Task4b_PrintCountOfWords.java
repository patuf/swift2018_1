package homework.consoleandloopsHmwk03;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();// make to be not case sensytive
        String[] words = str.split(" ");// take only words
        boolean isLetter = true;
        int countWord = 0;
        for (int i = 0; i < words.length; i++) {// iterate array of words
            isLetter=true;
            for (int j = 0; j < words[i].length(); j++) {
                char letter = words[i].charAt(j);
                if (!Character.isLetter(letter)) {
                    if (Character.isDigit(letter)) {
                        isLetter = false;
                        break;
                    }
                }
            }
            if (isLetter) {
                countWord++;

            }

        }
        System.out.println(countWord);
    }
}


