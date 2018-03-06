package hmw10;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueMembers {


    public static void main(String[] args) {
        // hashset take unique elements

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of numbers");
        int iterat = sc.nextInt();

        HashSet<Integer> uniqueItem = new HashSet<>();

        for (int i = 0; i < iterat; i++) {
            System.out.println("enter number");
            int digit = sc.nextInt();
            // add element
            uniqueItem.add(digit);
        }
        // print element
        for (Object item:uniqueItem) {
            System.out.print(item);
        }

    }


}
