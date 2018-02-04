import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();

        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row] [col] = col * n + row + 1;

                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}

