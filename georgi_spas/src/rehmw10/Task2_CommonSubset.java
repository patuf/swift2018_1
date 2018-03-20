package rehmw10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter integr number");
        int n = sc.nextInt();


        Set<Integer> fSequence = new HashSet<>();
        Set<Integer> sSequence = new HashSet<>();

        for (int i = 0; i < n ; i++) {

                System.out.println("enter integer digit");
                fSequence.add(sc.nextInt());

            }
        System.out.println("Emter integr number");
        int m = sc.nextInt();
        for (int i = 0; i < m ; i++) {

        System.out.println("enter integer digit");
        sSequence.add(sc.nextInt());

    }

fSequence.retainAll(sSequence);

        if (fSequence.isEmpty()){
            System.out.println("NO");
        }else{
            System.out.println(fSequence);
        }
    }
}
