package NumberOrNot;

import java.util.Scanner;

public class numberOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Input number!");
            String str = input.nextLine();
            if(str.equals("END"))break;
            try {
                double num = Double.parseDouble(str);
                System.out.println("Thanks for the number :)");
            }catch (NumberFormatException exception){
                System.out.println("Input was not a number!! @_@");
            }
        }while (true);
    }
}
