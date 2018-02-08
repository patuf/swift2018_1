import java.util.Scanner;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];

        int count = 1;
        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = 0; j < n - i; j++)
            {
                matrix[i + j][j] = count;
                count++;
            }
        }
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                matrix[j][i + j] = count;
                count++;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
