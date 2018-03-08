package WordReplacement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,String> words = new HashMap<String, String>();
        String str;
        int counter;
        String result = "";
        String currentWord = "";

        System.out.println("Input a sentence: ");
        str = input.nextLine();
        str = str.toLowerCase();
        System.out.println("Which words to replace and how many");
        counter = input.nextInt();
        for(int i=0;i<counter;i++){
            words.put(input.next(),input.next());
        }

        for(Character c : str.toCharArray()){
            if('a'<= c && c<='z') {
                currentWord += c;
            }else {
                if (words.containsKey(currentWord)) {
                    result += words.get(currentWord) ;
                } else result += currentWord ;

                result += c;
                currentWord = "";
            }
        }
        System.out.print(result);
    }
}
