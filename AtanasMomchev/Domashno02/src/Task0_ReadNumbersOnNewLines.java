import java.util.Scanner;

public class Task0_ReadNumbersOnNewLines {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int count;// this will keep how many numbers we will input
        String numbers = ""; // we will keep here the incoming numbers
        System.out.print("How many numbers will you enter: ");
        count = input.nextInt();
        System.out.println("Ok input them each on new line: ");
        //with this loop we will add the numbers to the string
        for(int i=0; i<count;i++){
            numbers += input.nextInt() + " ";
        }
        System.out.printf("Your numbers are: %s", numbers);
    }
}
