package hmw10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_6_WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] textLine = sc.nextLine().toLowerCase().split(" ");


        LinkedList<String> sentence = new LinkedList<>();
        // insert in linked list
        for (int i = 0; i < textLine.length; i++) {
            sentence.add(textLine[i]);
        }

        LinkedList<String> words = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            words.add(str);
            str = sc.next();
            words.add(str);
        }

        for (int j=0;j<  sentence.size();j++) {

            for (int i = 0; i < words.size(); i++) {
                int indx = sentence.get(j).indexOf(words.get(i));
                if (indx != -1) {
                    // take second word
                    sentence.set(j, words.get(indx+1));
                    words.remove(indx);
                    words.remove(indx);
                    break;
                }
            }

        }
        for (String word:sentence) {
            System.out.print(word+" ");
        }

    }
}
