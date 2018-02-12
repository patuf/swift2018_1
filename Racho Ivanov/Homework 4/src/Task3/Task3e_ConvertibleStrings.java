package Task3;

import Common.Scan;
import com.sun.org.apache.xml.internal.utils.StringComparable;

public class Task3e_ConvertibleStrings
{
    public static void main(String[] args)
    {
        char[] mainString = Scan.scanString().toCharArray();
        String lesserString = Scan.scanString();

        String mainStrCutToSize = "";

        for (int i = 0; i < lesserString.length() -1; i++)
        {
            mainStrCutToSize += mainString[i] + "";
        }

        //System.out.println(mainStrCutToSize);
        System.out.println(StringCompare(lesserString, mainStrCutToSize));

        boolean isComparableAfterCuting = false;
        for (int i = 0; i < lesserString.length(); i++)
        {
            if (StringCompare(mainStrCutToSize, Cutter(lesserString, i)))
            {
                isComparableAfterCuting= true;
                break;
            }
        }
        //System.out.println(isComparableAfterCuting);
    }
    static boolean StringCompare(String s1, String s2)
    {
        if (s1.equals(s2))
            return true;
        else
            return false;
    }

    static String Cutter(String s, int num)
    {
        String cutedString = "";

        for (int i = 0; i < s.length(); i++)
        {
            if (i != num)
                cutedString +=s.charAt(i);
        }
        //System.out.println(num + " : " + cutedString);
        return cutedString;
    }
}
