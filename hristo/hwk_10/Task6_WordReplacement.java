package swift2018_1.hristo.hwk_10;

import java.util.*;

public class Task6_WordReplacement {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        List<String> replace = new ArrayList<>();
        Stack st = new Stack();

        words.add("Peter");
        words.add("Loves");
        words.add("dogs");
        words.add("but");
        words.add("he");
        words.add("Hates");
        words.add("cats");

        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();

        for (int i = 0; i < firstNumber; i++) {

            replace.clear();
            replace.add(sc.next());
            replace.add(sc.next());


            for (int m = 0; m < words.size(); m++) {
                if (words.get(m).equalsIgnoreCase(replace.get(0))) {
                    words.set(m, replace.get(1));
                }
            }
        }

            for (int m = 0; m < words.size(); m++) {
                System.out.print(words.get(m) + " ");
            }

    }
}
