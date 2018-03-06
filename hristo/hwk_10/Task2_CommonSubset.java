package swift2018_1.hristo.hwk_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {
    public static void main(String[] args) {

        Set n = new HashSet();
        Set m = new HashSet();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            n.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            m.add(sc.nextInt());
        }

        n.retainAll(m);

        if (n.isEmpty()) {
            System.out.println("NO");
        } else System.out.println(n);


    }
}
