/*
Задача 0:
Напишете програма с името:
a) Task0a_CreateArray, която да създава масив от тип int и да го инициализира със стойностите 5, 9, 11, 3, 6, 4, 7.
Отпечатайте стойностите на екрана, всяка на нов ред.
 */

public class Task0a_CreateArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {5, 9, 11, 3, 6, 4, 7};

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }
    }
}
