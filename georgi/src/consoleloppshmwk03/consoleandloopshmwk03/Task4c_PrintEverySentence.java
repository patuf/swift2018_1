package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Senteces");
        String input=sc.nextLine();
        for (int i = 0; i <input.length() ; i++) {

            if (input.charAt(i)=='.'||input.charAt(i)=='?'||input.charAt(i)=='!'){

                System.out.println(input.charAt(i));
            }else{

                System.out.print(input.charAt(i));
            }
        }
    }
}
