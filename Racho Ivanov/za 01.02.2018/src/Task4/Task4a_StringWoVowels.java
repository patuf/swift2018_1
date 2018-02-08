package Task4;

import Common.Scan;

public class Task4a_StringWoVowels
{
    public static void main(String[] args)
    {
        String input = Scan.scanString();

        String[] parts = input.split("[aeuyoi]");

        for (String s: parts)
        {
            System.out.print(s);
        }
    }
}
