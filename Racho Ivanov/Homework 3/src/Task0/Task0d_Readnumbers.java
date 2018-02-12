package Task0;

import java.util.Scanner;

public class Task0d_Readnumbers
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int[] numbers = new int[scn.nextInt()];

        // Вариант в който използваме течението да броим корабчета

        for (int i  = 0; i < numbers.length; i ++)
        {
            numbers[i] = scn.nextInt();
        }

        for (int number: numbers)
        {
            System.out.println(number);
        }
    }
}
