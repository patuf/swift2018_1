package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentences");
        String[] s=sc.nextLine().split("\\D+");

        int[] intarray=new int[s.length];
        int sum=0;
        for(int i=0;i<s.length;i++){
            intarray[i]=Integer.parseInt(s[i]);

        }
        for(int i=0;i<s.length;i++){
            System.out.println(intarray[i]);

        }
    }
}
