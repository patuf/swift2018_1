import java.util.Scanner;
public class Task0b_ReadLine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Feed me a sentence: ");
        String s = input.nextLine(); // nextLine so it will take everything that is entered before enter
        System.out.println(s);
    }
}
