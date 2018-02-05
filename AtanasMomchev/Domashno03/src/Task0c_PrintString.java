import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string and i will return letters: ");
        //inputting string
        String str = input.nextLine();
        //creating a loop to go trough string
        for(int i=0;i<str.length();i++){
            //if statement to check if character is a letter
            if(Character.isAlphabetic(str.charAt(i))){
                //if letter printing on new row
                System.out.print("\n" + str.charAt(i));
            }else
            System.out.print(str.charAt(i));
        }
    }
}
