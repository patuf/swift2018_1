public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int rows = 4;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        int n = 1;

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = n;

                System.out.printf("%4d", matrix[i][j]);

                n++;
            }

            System.out.println();
        }
    }
}
