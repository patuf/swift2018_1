import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String binary = Integer.toString(num,2);

        String hex = Integer.toString(num,16);

        System.out.println(binary);
        System.out.println(hex.toUpperCase());
    }
}
