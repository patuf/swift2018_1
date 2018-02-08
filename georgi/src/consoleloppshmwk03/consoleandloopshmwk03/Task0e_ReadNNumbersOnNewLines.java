package consoleloppshmwk03.consoleandloopshmwk03;

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number showing the number of numbers you will write");
        byte n=sc.nextByte();// read input and storage in variable
        // loop for input nums and print
     String storageNums="";
        for (int i = 0; i <n ; i++) {// iterate and read input numbers
            System.out.println("Enter number and hit enter");
            int num=sc.nextInt();// read numbers
            storageNums+=num;
        }
// print nums
        for (int i = 0; i <storageNums.length() ; i++) {
            System.out.print(storageNums.charAt(i)+" ");
        }

    }
}
