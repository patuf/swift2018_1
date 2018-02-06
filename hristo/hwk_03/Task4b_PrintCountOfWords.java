package src.hwk_03;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        st = st.replaceAll("[.,!?]", ""); //Тук махаме някои, препинателни знаци

        String [] parts = st.split(" "); //Тук разбиваме стринга на парчета разделени с интервал

    int count =0;

       for (int i = 0; i < parts.length; i++) {

           if (parts[i].matches("^[a-zA-Z]+$")) { //този if проверява дали в думата има букви
               count++;
           }
       }
        System.out.println(count);

    }
}
