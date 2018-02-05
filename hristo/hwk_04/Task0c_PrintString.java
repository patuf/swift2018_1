package src.hwk_04;

import java.util.Scanner;

public class Task0c_PrintString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        for (int i = 0; i < st.length(); i++){ //Открих, че .length() намира броя на символите в низа

            System.out.println(st.charAt(i));
        }
    }
}
