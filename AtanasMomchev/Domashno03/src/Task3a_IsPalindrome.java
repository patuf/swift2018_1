import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        //a string where to keep the reversed string
        String reversStr = "";
        //loop to reverse the first string
        for(int i=str.length()-1; i>=0;i--){
            reversStr += str.charAt(i);
        }
        //checking if string is palindrome and printing result
        System.out.println(str.equals(reversStr));
    }
}
