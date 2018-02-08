import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String output = "";

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            output += num + " ";
        }

        System.out.println(output);
    }
}
