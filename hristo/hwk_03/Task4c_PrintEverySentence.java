package src.hwk_03;

import java.util.Scanner;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        String [] sm = st.split("[.!?]");

        for (int i = 0; i < sm.length; i++){
         /*Програмата тръгва, но изрязва, за това ги добявам накрая. Лошото, е че ако има "!" или "?"
         * пак слага почка :)*/

            System.out.println(sm [i].trim()+ ".");
        }
    }
}
