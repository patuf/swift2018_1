package Task2;


import Common.Scan;

public class Task2a_PrintLargestNumber
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}


		int largest = Integer.MIN_VALUE;
		for (int num: numbers)
		{
			if (num > largest)
				largest = num;
		}

		System.out.println(largest);
	}
}
