import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chisla[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        System.out.println ("General order is: ");
        for (int i:chisla) {
            System.out.print(i);
        }
        Arrays.sort(chisla);

        System.out.print("\n\nAscending Order is  : ");

        for (Integer i : chisla) {
            System.out.print(i.intValue() + " ");
        }
    }
}
