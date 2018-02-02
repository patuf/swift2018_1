import java.util.Scanner;

public class Task2b_PrintReverseSequence {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String rev = "";
        String rev1 = "";
        System.out.print("How many numbers do you want reversed: ");
        int broi = input.nextInt();
        System.out.print("Input numbers: ");
        input.nextLine();
        String numbers = input.nextLine();
        //looping through the string
        for(String part : numbers.split("\\s+")){
            String temp;
            temp = part;
            // reverting each number so later i can revert the whole string
            for(int i=temp.length()-1;i>=0;i--) {
                rev += temp.charAt(i);
            }
            rev += " "; // adding space between numbers
        }
        //reverting the string so i can get the opposite numbers
       for(int i=rev.length()-1; i>=0 ; i--){
           rev1 += rev.charAt(i);
       }
        System.out.print("Reverse order " + rev1);
    }
}
