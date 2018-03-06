package swift2018_1.hristo.hwk_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {


        Set set = new HashSet();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            set.add(sc.nextInt());
        }

        System.out.println(set);

    }
}

