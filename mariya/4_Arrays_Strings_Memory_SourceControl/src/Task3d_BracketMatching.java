import java.util.Scanner;

public class Task3d_BracketMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean bracketsAreCorrectlySet = true;

        while (input.length() > 0) {
            input = input.replace("[]", "");
            input = input.replace("{}", "");
            input = input.replace("()", "");
            if (input.length() == input.length()) {
                bracketsAreCorrectlySet = false;
                break;
            }
        }

        System.out.println(bracketsAreCorrectlySet);
    }
}
