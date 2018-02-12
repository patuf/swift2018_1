package swift2018_1.hristo.hwk_04;

import java.util.Scanner;

public class Task3c_CaesarCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int length = st.length();
        int [] ascii = new int[length];
        char ch = st.charAt(length);

        for (int temp = 0; temp < st.length(); temp++) {

            ch = st.charAt(temp);
            ascii [temp] = (int) ch;
            System.out.println(ch + " = " + ascii [temp]);
        }


    }
}
