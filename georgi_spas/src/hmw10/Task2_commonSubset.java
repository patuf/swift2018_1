package hmw10;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_commonSubset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size first sequqnece:");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("enter size second sequqnece:");
        int m = sc.nextInt();


            boolean hasCommonItem=false;
        List fSequence = new ArrayList();
        List sSequence = new ArrayList();

        for (int i = 0; i < n + m; i++) {
            System.out.println("enter digit");
            int input = sc.nextInt();
            // input first Sequence
            if (i < n) {
                fSequence.add(input);
            } else {
                // input Sequence
                sSequence.add(input);
            }
        }

        // searche common items
        for (Object item : fSequence) {
                if (sSequence.contains(item)){
                    System.out.print(item+" ");
                    hasCommonItem=true;
                }
        }
        if (!hasCommonItem){
            System.out.println("No");
        }


    }
}
