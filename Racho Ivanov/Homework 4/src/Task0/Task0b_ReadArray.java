package Task0;


import java.util.Scanner;

public class Task0b_ReadArray
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		int[] numbers = new int[scn.nextInt()];

		for (int i  = 0; i < numbers.length; i ++)
		{
			numbers[i] = scn.nextInt();
		}

		for (int i  = 0; i < numbers.length; i ++)
		{
			if (i < numbers.length - 1)
				System.out.print(numbers[i] + ",");
			else
				System.out.print(numbers[i]);
		}
	}
}
