package src.hwk_04;

import java.util.Scanner;

public class Task0b_ReadArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int[] array = new int[i];


        for (int temp = 0; temp < array.length; temp++) {

            array[temp] = sc.nextInt();
        }

        for (int element = 0; element < array.length; element++) {

            if(element < array.length -1) {
                System.out.print(array[element] +", ");
            }
            else
                System.out.print(array[element]);
            {


            }
        }
    }
}
