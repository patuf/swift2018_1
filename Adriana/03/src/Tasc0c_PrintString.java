import java.util.Scanner;

public class Tasc0c_PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = str.length();
        for (i=0; i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
    }
}
