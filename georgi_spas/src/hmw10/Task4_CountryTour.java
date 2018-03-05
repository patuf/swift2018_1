package hmw10;

import java.util.LinkedList;
import java.util.Scanner;

public class Task4_CountryTour {
    public static void main(String[] args) {
        LinkedList <Integer> disatanceInDays=new LinkedList<>();
        LinkedList<Integer>foodIndays=new LinkedList<>();
        Scanner sc=new Scanner(System.in);

        int iterations=sc.nextInt();
        for (int i = 0; i <iterations ; i++) {
            int distance=sc.nextInt();
            int food=sc.nextInt();
            if (i==0){
                disatanceInDays.addFirst(distance);
                foodIndays.addFirst(food);
            }else if (i<iterations-1){
                disatanceInDays.add(distance);
                foodIndays.add(food);     
            }else {
                disatanceInDays.addLast(distance);
                foodIndays.addLast(food);
            }
        }

        int restFood=0;
        for (int i = 0; i <disatanceInDays.size() ; i++) {

                restFood += disatanceInDays.get(i) - foodIndays.get(i);

        }


        if (restFood==0){
            System.out.println(disatanceInDays.size());
        }else{
            System.out.println("NO");
        }


    }
}
