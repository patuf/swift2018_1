package Task3;

import Common.Scan;

public class Task3f_LongestCommonSubstring
{
    public static void main(String[] args)
    {
        String s1 = Scan.scanString().toLowerCase();
        String s2 = Scan.scanString().toLowerCase();
        int count = 0;
        char[] results = new char[0];

        for (int i = 0; i < s1.length(); i++)
        {
            for (int j = i; j < s2.length(); j++)
            {
                if (s1.charAt(i + count) == s2.charAt(j))
                {
                    count++;
                }
                else
                {
                    if (count > results.length)
                    {
                        results = new char[count];
                        int r = 0;
                        for (int k = i; k < i + count; k++)
                        {
                            results[r] = s1.charAt(k);
                            r++;
                        }
                    }
                    count = 0;
                }

            }
        }
        System.out.println(results);
    }
}
