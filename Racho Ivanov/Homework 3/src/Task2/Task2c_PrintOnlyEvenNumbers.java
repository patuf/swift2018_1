package Task2;

import Common.Scan;

public class Task2c_PrintOnlyEvenNumbers
{
    public static void main(String[] args)
    {
        int[] numbers = new int[Scan.scanInt()];

        // Вариант в който използваме течението да броим корабчета

        for (int i  = 0; i < numbers.length; i ++)
        {
            numbers[i] = Scan.scanInt();
        }

        for (int i  = 0; i < numbers.length; i ++)
        {
            if (numbers[i] % 2 == 0)
            System.out.print(numbers[i] + " ");
        }
    }
}
