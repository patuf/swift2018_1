package src.hwk_04;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int [] array = new int [i];

        int largest = Integer.MIN_VALUE; //Това вади минималната стойност на Integer

        for (int temp = 0; temp < array.length; temp++) { //С този loop присвояваме стойности на масива

            array[temp] = sc.nextInt();

        }

        for (int temp = 0; temp < array.length; temp++) {
        /* С този loop проверяваме всяка стойност дали е по-голяма от предишната и ако да я заема.
        * По принцип според мен би трябвало да работи само ако последната стойност е по-голяма, но работи нормално*/
            if (array[temp] > largest) {
                largest = array[temp];
            }

        }
        System.out.print(largest);







        }


    }

