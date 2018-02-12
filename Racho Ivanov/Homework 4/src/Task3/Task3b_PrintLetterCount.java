package Task3;


import Common.Scan;

import java.util.HashMap;
import java.util.Map;

public class Task3b_PrintLetterCount
{
	public static void main(String[] args)
	{
		char[] charArray = Scan.scanString().toCharArray();

		Map<Character, Integer> charsMap = new HashMap<Character, Integer>();

		for (char c: charArray)
		{
			if (charsMap.containsKey(c))
				charsMap.put(c,charsMap.get(c) + 1);
			else
				charsMap.put(c,1);
		}

		for (char c: charsMap.keySet())
		{
			System.out.printf("%c(%d)", c, charsMap.get(c));
			System.out.println();
		}
	}
}
