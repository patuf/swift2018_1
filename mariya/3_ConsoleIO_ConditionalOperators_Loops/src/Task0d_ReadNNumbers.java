import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            System.out.println(num);
        }
    }
}
