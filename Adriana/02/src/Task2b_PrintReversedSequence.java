import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chisla[] = new String[n];
        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            chisla[i] = sc.nextLine();
        }
        String reverse = new StringBuilder(chisla[n]).reverse().toString();
        System.out.println(reverse);

    }
}