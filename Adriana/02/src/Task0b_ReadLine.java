import java.util.Scanner;

public class Task0b_ReadLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something");
        String something = sc.nextLine();
        System.out.printf("%s",something);
    }
}
