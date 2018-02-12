package Task2;

import Common.Scan;

import java.util.Arrays;

public class Task2i_FindKInSorted
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];
		int k = Scan.scanInt();

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}

		Arrays.sort(numbers);

		int mid = numbers.length/2;

		//Binary search new design
		while(true)
		{
			if(k == numbers[mid])
			{
				System.out.println(mid);
				break;
			}
			else if (k > numbers[mid])
			{
				if (mid == numbers.length -1)
				{
					System.out.println("No");
					break;
				}
				mid = (mid + numbers.length) / 2;
			}
			else if(k < numbers[mid])
			{
				if (mid == 0)
				{
					System.out.println("No");
					break;
				}
				mid = mid / 2;
			}

		}
	}
}
