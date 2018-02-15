package Task1;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt();

        int sum = 0;

        do
        {
          sum+=(input % 10);
          input /=10;
        } while(input > 0);

        System.out.println(sum);
    }


}
