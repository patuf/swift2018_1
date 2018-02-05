package src.hwk_03;

import java.util.Scanner;

public class Task4a_StringWoVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        st = st.replaceAll("[AEIOUaeiou]", "");

        System.out.print(st);
    }
}
