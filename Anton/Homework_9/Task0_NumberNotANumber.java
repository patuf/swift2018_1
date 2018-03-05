import java.util.Scanner;

public class Task0_NumberNotANumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        if (scan.hasNextLine()) {
            do {
                String str = scan.nextLine();
                try {
                    Integer.parseInt(str);
                    System.out.println("Number");
                } catch (NumberFormatException notanumber) {
                    System.out.println("Not a number");
                }
                if (str.equals("END")) {
                    break;
                }
            } while (scan.hasNextLine());
        }
    }
}