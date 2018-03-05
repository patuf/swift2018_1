package ChildPlay;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> children = new LinkedList<Integer>();
        int counter ;
        int rounds = 0;
        System.out.println("How many children: ");
        counter = input.nextInt();
        System.out.println("Bring the kids in: ");
        for(int i=0;i<counter;i++){
            children.add(input.nextInt());
        }
        end:
        while (true){
            boolean endGame = true;
            if(children.size()==1) break end;
            for(int i=children.size()-1;1<=i;i--){
                if(children.get(i-1)<children.get(i)) {
                    children.remove(i);
                    endGame = false;
                }else if(i == 1 && endGame == true) break end;
            }
            rounds++;
        }
        System.out.print(rounds);
    }
}
