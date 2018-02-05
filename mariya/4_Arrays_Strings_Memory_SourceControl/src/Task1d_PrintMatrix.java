import java.util.Scanner;

public class Task1d_PrintMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int rows = n;
        int cols = n;
        int[][] matrix = new int[rows][cols];

        int dir = 0;
        int r = 0;
        int c = 0;
        int count = 1;
        while (count <= n * n)
        {
            if (dir == 0)
            {
                matrix[r][c] = count;
                count++;
                r++;

                if (r == n || matrix[r][c] != 0)
                {
                    r--;
                    c++;
                    dir++;
                }
            }
            else if (dir == 1)
            {
                matrix[r][c] = count;
                count++;
                c++;

                if (c == n || matrix[r][c] != 0)
                {
                    c--;
                    r--;
                    dir++;
                }
            }
            else if (dir == 2)
            {
                matrix[r][c] = count;
                count++;
                r--;

                if (r == -1 || matrix[r][c] != 0)
                {
                    r++;
                    c--;
                    dir++;
                }
            }
            else if (dir == 3)
            {
                matrix[r][c] = count;
                count++;
                c--;

                if (c == -1 || matrix[r][c] != 0)
                {
                    c++;
                    r++;
                    dir = 0;
                }
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
