package Task3;

import Common.Scan;

public class Task3c_PrnitCristmasTree
{
    public static void main(String[] args)
    {
        int input = Scan.scanInt();

        for (int i = 0; i <= input-3
                ; i++)
        {
            for (int j = input / 2 - i + 1; j >=0; j--)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i <= 1; i++)
        {
            for (int j = input / 2 - i + 1; j >=0; j--)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
