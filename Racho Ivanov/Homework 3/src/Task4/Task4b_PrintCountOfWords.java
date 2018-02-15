package Task4;

import Common.Scan;

public class Task4b_PrintCountOfWords
{
    public static void main(String[] args)
    {
        String input = Scan.scanString();

        input.toLowerCase();
        String[] words = input.split("[. ]");

        boolean isWord = true;
        int counter = 0;

        for (String s: words)
        {
            char[] c = s.toCharArray();
            for (char ch: c)
            {
                if((int)ch > 122 || (int)ch < 97)
                    isWord = false;
                    break;
            }
            if (isWord)
                counter++;
            isWord = true;

        }
        System.out.println(counter);
    }
}
