package src.hwk_03;

import java.util.Scanner;

public class Task3a_PrintSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int size = sc.nextInt();

        for(int i=1;i<=size;i++){

            for(int j=1;j<=size;j++){

                if(i==1||i==size|j==1||j==size){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
