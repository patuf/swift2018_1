package Task2;

import Common.Scan;

public class Task2c_PrintClusterCount
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}

		int count = 0;

		for (int i = 0; i < numbers.length-1; i++)
		{
			if (i == 0 && numbers[i] == numbers[i+1])
				count++;
			else if (i >= 0 && numbers[i] == numbers[i+1] && numbers[i] != numbers[i-1])
				count++;
		}

		System.out.println(count);
	}
}
