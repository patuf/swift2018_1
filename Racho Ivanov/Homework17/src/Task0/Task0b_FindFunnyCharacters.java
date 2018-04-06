package Task0;

import java.util.Scanner;

public class Task0b_FindFunnyCharacters
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		Task0a_Findintegers.printAllRegexMatches(scn.nextLine(),"\\W");
	}
}
