import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String compare = sc.nextLine();

        String temp = "";
        String end = "";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == compare.charAt(i)) {
                temp += input.charAt(i);
            } else {
                if (temp.length() >= end.length()) {
                    end = temp;
                    temp = "";
                }
            }
        }

        System.out.println(end);
    }
}
