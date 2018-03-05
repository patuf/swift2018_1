package Subset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CommonSubset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        List<Integer> firstRow = new ArrayList<Integer>();
        List<Integer> secondRow = new ArrayList<Integer>();
        HashSet<Integer> commonNumbers = new HashSet<Integer>();
        int counterOne;
        int counterTwo;
        System.out.println("How many numbers will you use for row one and two");
        counterOne = input.nextInt();
        counterTwo = input.nextInt();
        System.out.println("Input firstRow: ");
        for (int i=0;i<counterOne;i++){
            firstRow.add(input.nextInt());
        }
        System.out.println("Input second row: ");
        for(int i=0;i<counterTwo;i++){
            secondRow.add(input.nextInt());
        }
        while (counterOne>0){
            if(secondRow.contains(firstRow.get(counterOne-1)))
                commonNumbers.add(firstRow.get(counterOne-1));
            counterOne--;
        }
        if(commonNumbers.isEmpty()) System.out.println("NO");
        else{
            for (Integer num : commonNumbers){
                System.out.print(num + " ");
            }
        }
    }
}
