package src.hwk_03;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Task4d_PrintSumOfNumbersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        int sum = 0;

        for (char ch : st.toCharArray()){

            if (Character.isDigit(ch)) {
                int a = ch - 48;

                sum = sum + a;
            }
        }
// Програмата за сега само събира цивфрите, а не числата
        System.out.println(sum);
    }
}
