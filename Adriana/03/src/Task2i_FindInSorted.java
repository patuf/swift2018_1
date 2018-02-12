import java.util.Arrays;
import java.util.Scanner;

public class Task2i_FindInSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;
        int chisla[] = new int[n];
        System.out.println("enter numbers");
        for (i = 0; i < n; i++) {
            chisla[i] = sc.nextInt();
        }
        Arrays.sort(chisla);
        int poziciq = Arrays.binarySearch(chisla,k);
        System.out.print(poziciq);
    }
}
//??