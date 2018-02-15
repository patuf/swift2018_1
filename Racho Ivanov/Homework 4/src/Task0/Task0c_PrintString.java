package Task0;

import Common.Scan;

public class Task0c_PrintString
{
	public static void main(String[] args)
	{
		char[] charArray = Scan.scanString().toCharArray();

		for (char c: charArray)
		{
			System.out.println(c);
		}
	}
}
