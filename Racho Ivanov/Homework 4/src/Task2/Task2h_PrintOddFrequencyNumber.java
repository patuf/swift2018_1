package Task2;

import Common.Scan;

import java.util.HashMap;
import java.util.Map;

public class Task2h_PrintOddFrequencyNumber
{
	public static void main(String[] args)
	{
		int[] numbers = new int[Scan.scanInt()];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Scan.scanInt();
		}

		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

		for (int num: numbers)
		{
			if (nums.containsKey(num))
				nums.put(num, nums.get(num)+1);
			else
				nums.put(num, 1);
		}
		System.out.println(nums.entrySet());


		for (int num: nums.keySet())
		{
			if(nums.get(num)%2 != 0)
				System.out.println(num);
		}


	}
}
