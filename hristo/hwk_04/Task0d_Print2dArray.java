package src.hwk_04;

public class Task0d_Print2dArray {

    public static void main(String[] args) {

        int row = 4;
        int col = 4;

        int [][] matrix = new int [row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){

                matrix [i][j] = (i+1)*col-3 + j; //100% има по-елегантен начин, но до това решение стигнах

                System.out.printf("%4d", matrix[i][j]);
            }

            System.out.println();
        }
    }
}
