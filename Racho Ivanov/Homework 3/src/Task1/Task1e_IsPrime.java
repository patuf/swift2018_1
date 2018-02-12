package Task1;

import Common.Scan;

public class Task1e_IsPrime
{
    public static void main(String[] args)
    {
        int input ;//= Scan.scanInt();

        boolean isPrime = true;

        for (int j = 1; j < 101; j++)
        {
            input = j;

            for (int i = 2; i <= input/2; i++)
            {
                if (input % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            System.out.println(j + " " +isPrime);
            isPrime = true;
        }



    }
}
