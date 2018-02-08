import java.util.Scanner;

public class Тask1b_PrintMatrix {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();

        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if (col % 2 == 0)
                {
                    matrix[row] [col] = col * n + row + 1;
                }
                else
                {
                    matrix[row] [col] = n * (col + 1) - row;
                }

                System.out.printf("%4d", matrix[row][col]);
            }

            System.out.println();
        }
    }
}
