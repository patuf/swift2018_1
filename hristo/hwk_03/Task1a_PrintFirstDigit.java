import java.util.Scanner;

public class Task1a_PrintFirstDigit {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        {
            // Следва цикъл, който дели всеки път входа на 10, докато не стане по-малък от 10

            while (i >= 10) {

                i = i / 10;
            }
            System.out.println(i);
        }

    }
}
