import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int number = sc.nextInt();
        System.out.println((number > 0) && (number < 10));

    }
}
