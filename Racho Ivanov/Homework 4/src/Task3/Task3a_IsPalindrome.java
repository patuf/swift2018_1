package Task3;

import Common.Scan;

public class Task3a_IsPalindrome
{
	public static void main(String[] args)
	{
		String s = Scan.scanString();

		StringBuilder sb = new StringBuilder();

		sb.append(s);
		sb.reverse();

		boolean isPalindrome = true;

		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == sb.charAt(i))
				isPalindrome = true;
			else
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome);
	}
}
