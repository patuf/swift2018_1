import java.util.Scanner;

public class Task0_NumberNotANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            int test;
            try{
                test = Integer.parseInt(input);
                System.out.println("Number");
            } catch (NumberFormatException ex) {
                System.out.println("Not a number");
            }
        }
    }
}
