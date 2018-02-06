import java.util.Scanner;
import java.util.Arrays;

public class Task1a_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix [][] = new int [n][n];
        int i = 0;
        int j = 0;
        int a = 1;

        for (i=0; i < n; i++){
            for (j=0; j < n; j++){
                for (a=1; a<= n*n; a++) {

                    matrix[i][j] = a;

                    System.out.print(matrix[i][j] + " ");
                    if (a % n == 0) {
                        System.out.println();
                    }


                }
            }

        }

    }
}
