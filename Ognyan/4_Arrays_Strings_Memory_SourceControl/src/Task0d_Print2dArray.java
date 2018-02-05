/*
Задача 0:
Напишете програма с името:
d) Task0d_Print2dArray, която да отпечата на стандартния изход двуизмерен масив 4х4,
инициализиран със стойностите на числата от 1 до 16.
 */

public class Task0d_Print2dArray {
    public static void main(String[] args) {

        int columnValue = 4;
        int rowValue = 4;
        int matrix[][] = new int[rowValue][columnValue];
        int count = 1;

        for (int i = 0; i < rowValue; i++) {
            for (int j = 0; j < columnValue; j++) {
                matrix[i][j] = count;
                count++;
                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
