package Task2;

import Common.Scan;

public class Task2e_LongestIncreasingSubsequence
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}

		int[] results = new int[1];
		int fillCounter = 1;

		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i-1] < numbers[i])
			{
				fillCounter++;
			}
			else
				if (fillCounter > results.length)
				{
					results = new int[fillCounter];
					int r = 0;
					for (int j = i - fillCounter; j < i; j++)
					{
						results[r] = numbers[j];
						r++;
					}
					fillCounter = 1;
				}
		}
		for (int num : results)
		{
			System.out.print(num + " ");
		}
	}
}
