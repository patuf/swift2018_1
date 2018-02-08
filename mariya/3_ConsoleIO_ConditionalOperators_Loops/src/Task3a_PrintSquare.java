import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String firstLine = "";

        for (int i = 0; i < n; i++) {
            firstLine += "*";
        }

        System.out.println(firstLine);

        for (int j = 0; j < n - 2; j++) {
            String line = "";
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    line += "*";
                }
                else if (i == n - 1){
                    line += "*";
                }
                else {
                    line += " ";
                }
            }
            System.out.println(line);
        }

        String lastLine = "";

        for (int i = 0; i < n; i++) {
            lastLine += "*";
        }

        System.out.println(lastLine);
    }
}
