package homework.consoleandloopsHmwk03;

import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        ////////////////////  a)Task4a_StringWoVowels  //////////////
        Scanner sc = new Scanner(System.in);
        System.out.println("Write sentence\n");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            switch ((char) str.charAt(i)){
                case 'a':break;
                case 'e':break;
                case 'o':break;
                case 'u':break;
                case 'i':break;
                case 'y':break;
                default:
                    System.out.print((char) str.charAt(i));break;

            }
        }

    }
}
