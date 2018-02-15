package Task2;

import Common.Scan;

public class Task2a_PrintSumOfN
{
    public static void main(String[] args)
    {
        int n = Scan.scanInt();
        int sum = 0;

        for (int i = 0 ; i < n ; i++)
        {
            sum+=Scan.scanInt();
        }
        System.out.println(sum);
    }
}
