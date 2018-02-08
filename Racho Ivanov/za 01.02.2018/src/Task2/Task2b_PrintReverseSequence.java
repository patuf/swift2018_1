package Task2;

import Common.Scan;

public class Task2b_PrintReverseSequence
{
    public static void main(String[] args)
    {
        int[] numbers = new int[Scan.scanInt()];

        // Вариант в който използваме течението да броим корабчета

        for (int i  = 0; i < numbers.length; i ++)
        {
            numbers[i] = Scan.scanInt();
        }

        for (int i = numbers.length-1; i >= 0; i--)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
