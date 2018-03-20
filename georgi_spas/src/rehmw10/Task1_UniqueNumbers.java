package rehmw10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of numbers");
        int n=sc.nextInt();
        Set<Integer> nums=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            System.out.println("enter integer number");
            nums.add(sc.nextInt());
        }
        System.out.println(nums);
    }
}
