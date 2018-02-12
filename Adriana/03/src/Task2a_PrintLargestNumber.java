import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chisla [] = new int [n];
        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        int max = chisla[0];
        for (int kontrola = 0; kontrola < chisla.length; kontrola++) {
            if (chisla[kontrola] > max) {
                max = chisla[kontrola];
            }
        }
            System.out.print("The bigges number is " + max);
    }
}
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int chisla [] = new int [n];
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            chisla[i] = sc.nextInt();
            System.out.println(chisla[n]);
        }
        for (int i : chisla){
            System.out.println(chisla);
        }*/
       /* int max = chisla[0];
        for (int kontrola= 0; kontrola < chisla.length; kontrola++){
            if (chisla[kontrola] > max){
                max = chisla [kontrola];
            }

        System.out.print(max);
*/


       // }
/*

    }
}
*/
