import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int sum = 0;

        for (char ch: input.toCharArray()) {
            int value = Character.getNumericValue(ch);

            sum += value;
        }

        System.out.println(sum);
    }
}
