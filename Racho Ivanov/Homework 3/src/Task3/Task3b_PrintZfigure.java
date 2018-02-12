package Task3;

import Common.Scan;

public class Task3b_PrintZfigure
{
    public static void main(String[] args)
    {
        int input = Scan.scanInt();

        for (int i = 0; i <= input-1; i++)
        {
            for (int j = 0; j <= input-1; j++)
            {
                if (i == 0 || i == input-1 || j == input - i -1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
