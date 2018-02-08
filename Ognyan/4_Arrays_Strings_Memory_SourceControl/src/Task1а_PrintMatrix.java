/*
Задача 1: PrintMatrix
Попълнете и принтирайте на екрана матрица NxN с числата от 1 до N2, използвайки цикли.
Числото N е въведено от стандартния вход, а на изхода трябва да се принтира двумерния масив, попълнен в следния формат:
a)
 */
import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = Integer.parseInt(in.nextLine());
        int colomn = Integer.parseInt(in.nextLine());

        int matrix[][] = new int[row][colomn];
        int count = 1;

        for (int i = 0; i < colomn; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = count;
                count += colomn;
                System.out.printf("%4d", matrix[i][j]);
            }
            count = 2 + i;
            System.out.println();
        }
    }
}
