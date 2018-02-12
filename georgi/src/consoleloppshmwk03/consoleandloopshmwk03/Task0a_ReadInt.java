package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task0a_ReadInt {
    public static void main(String[] args) {
        // a) Read integer from consol
        Scanner sc=new Scanner(System.in);// stream in

        System.out.println("Enter integer number(example 0,1,10 ... etc");// steram out
        int num=sc.nextInt();// stream in receive data from input and storage in primitive type

        // subtask is to increment the num
        System.out.println("Input num is "+num);
        System.out.println("Increment num is "+(++num));
    }
}
