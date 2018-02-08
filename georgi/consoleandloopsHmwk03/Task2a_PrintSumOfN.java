package homework.consoleandloopsHmwk03;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        //////////   a) Task2a_PrintSumOfN   ///////////

        Scanner sc=new Scanner(System.in);

        System.out.println("enter positive number");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("enter numbers delimeted whit blanlk and hit enter ");
        for (int i = 0; i <n ; i++) {

            int a=sc.nextInt();
            sum+=a;
        }
        System.out.println();
        System.out.println("Sum="+sum);
    }
}
