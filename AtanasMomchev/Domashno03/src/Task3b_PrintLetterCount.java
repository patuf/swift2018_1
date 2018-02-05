import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        //lesna zadacha veroyatno napravena po mnogo slojen nachin :D
        Scanner input = new Scanner(System.in);
        System.out.print("Input string to count each letter: ");
        String str = input.nextLine();
        //string to keep letters
        String letter = "";
        //counter to count letters
        int counter = 1;
        String  [] ans = new  String  [str.length()];
        //changing all letters to lower case
        str = str.toLowerCase();
        //looping troughtthe string
        for(int i=0; i<str.length();i++){
            letter = ""; // setting letter to empty
            letter += str.charAt(i); // setting letter to char at i
            //looping again trough string but from next symbol
            for(int j=i+1; j<str.length();j++){
                //if the letter has already been in the string then go to next iteration
                if(str.substring(0,i).contains(letter))continue;
                // if char at i has equals add one to counter
                if(str.charAt(i) == str.charAt(j)) counter++;
            }
            //if the letter is contained in the substring add skip to the array
            if(str.substring(0,i).contains(letter)){
                ans[i] = "skip";
            }else {
                // add counter to letter and then add it to the array set counter to 1
                letter += "(" + counter + ")";
                ans[i] = letter;
                counter = 1;
            }
        }
        //sort the array
        Arrays.sort(ans);
        //loop trough the array and if there is no spaces or skip then print
        for(int i=0;i<str.length();i++){
            if(ans[i].contains(" ")|| ans[i].contains("skip"))continue;
            System.out.println(ans[i]);
        }
    }
}
