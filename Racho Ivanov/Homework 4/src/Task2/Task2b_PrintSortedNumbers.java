package Task2;

import Common.Scan;

public class Task2b_PrintSortedNumbers
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}

		int swap = 0;

		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers.length -1; j++)
			{
				if (numbers[j] > numbers[j+1])
				{
					swap = numbers[j + 1];
					numbers[j+1] = numbers[j];
					numbers[j] = swap;
				}
			}
		}

		for (int num: numbers)
		{
			System.out.print(num + " ");
		}

	}
}
