package rehmw10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacment {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toUpperCase();
        int n = sc.nextInt();
        Map<String, String> dictionary = new HashMap<>();

        for (int i = 0; i <n ; i++) {
            String[] split=sc.nextLine().split(" ");
            dictionary.put(split[0].trim().toLowerCase(),split[1].trim().toUpperCase());
        }

        String result="";
        String word="";
        for (Character ch:sentence.toCharArray()){
            if ('a'<=ch&&ch<='z'){
                word+=ch;
            }else {
                if (dictionary.containsKey(word)){
                    result+=word;
                }else{
                    result+=word;
                }
                result+=ch;
                word="";
            }
        }
        if (!word.isEmpty()){
            if (dictionary.containsKey(word)){
                result+=dictionary.get(word);
            }
            else {
                result+=word;
            }
        }
        System.out.println(result);
    }

}
