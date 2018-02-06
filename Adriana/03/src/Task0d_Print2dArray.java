import java.util.Arrays;

public class Task0d_Print2dArray {
    public static void main(String[] args) {
       int masiv [] [] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
       // System.out.println(masiv [4][4]);

        int row = 4;
        int col = 4;
       // int masiv [] [] = new int [row] [col];
        int i = 0;
        int j = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j <col; j++) {
                int a = 1;

               // masiv[i][j] = a++;
                System.out.print(masiv[i][j] + " ");

            }
            System.out.println();
        }


    }
}


