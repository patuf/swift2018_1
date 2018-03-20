package demo10strurcutredata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_childPlay {

    static int expelledKids(List<Integer>kids){
        int round=-1;
        boolean played;
        do {
            round++;
            played=false;
            for (int i = kids.size()-1; i >=1 ; i--) {
                if (kids.get(i)>kids.get(i-1)) {
                    kids.remove(i);
                    played=true;
                }
            }

        }while (played);
        return round;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        List<Integer> kids=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            System.out.println("enter kids height");
            kids.add(sc.nextInt());
        }
        System.out.println(expelledKids(kids));
    }
}
