package Task0;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0a_Findintegers
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();

	printAllRegexMatches(input,"\\d");


	}

	public static void printAllRegexMatches(String input, String pattern)
	{

		Pattern regex = Pattern.compile(pattern);

		Matcher matcher = regex.matcher(input);

		while (matcher.find())
		{
			System.out.printf("Found match [%s] at index [%d]%n", matcher.group(), matcher.start());
		}
	}
}
