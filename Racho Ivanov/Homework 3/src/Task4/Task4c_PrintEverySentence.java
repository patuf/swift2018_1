package Task4;

import Common.Scan;

public class Task4c_PrintEverySentence
{
    public static void main(String[] args)
    {
        String input = Scan.scanString();

        char[] charArr = input.toCharArray();

        for (int i = 0; i < charArr.length; i ++)
        {
            if(charArr[i] == '.' || charArr[i] == '!' || charArr[i] == '?')
            {
                System.out.print(charArr[i]);
                i++;
                System.out.println();
            }
            else
            {
                System.out.print(charArr[i]);
            }
        }
    }
}
