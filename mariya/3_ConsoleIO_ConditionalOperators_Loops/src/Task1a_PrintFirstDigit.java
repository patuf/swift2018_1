import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String firstNum = input.substring(0, 1);

        System.out.println(firstNum);
    }
}
