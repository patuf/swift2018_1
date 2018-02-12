package Task2;

import Common.Scan;

public class Task2d_PrintSplitIndex
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}


		int sum1 , sum2 ;
		int index = 0;
		boolean isEqual = false;

		for (int i = 0; i < numbers.length-1; i++)
		{
			sum1 = sum2 = 0;
			for (int j = 0; j < i; j++)
			{
				sum1+=numbers[j];
				index = j;
			}
			for (int j = index + 1; j < numbers.length; j++)
			{
				sum2 +=numbers[j];
			}
			//System.out.println("Sum1 =" + sum1 + " Sum2 = " + sum2);
			if (sum1 == sum2)
			{
				isEqual = true;
				break;
			}
		}

		if (isEqual)
			System.out.println(index);
		else
			System.out.println("NO");
	}
}
