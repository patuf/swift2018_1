import java.util.Scanner;
public class Task3e_ConvertibleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String compare = sc.nextLine();
        boolean works = true;

        for (int i = 0; i < compare.length(); i++) {
            if (compare.charAt(i) != input.charAt(i)) {
                for (int j = i; j < input.length(); j++) {
                    if (input.charAt(j) == compare.charAt(i)) {
                        works = true;
                        break;
                    } else {
                        works = false;
                    }
                }
            }
        }
        System.out.println(works);
    }
}
