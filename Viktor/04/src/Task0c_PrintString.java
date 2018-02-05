import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] symbol = text.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            System.out.println(symbol[i]);
        }
    }
}


