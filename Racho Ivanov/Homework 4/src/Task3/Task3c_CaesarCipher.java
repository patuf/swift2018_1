package Task3;


import Common.Scan;

public class Task3c_CaesarCipher
{
    public static void main(String[] args)
    {
        String str = Scan.scanString();
        String action = Scan.scanString().toLowerCase();


        switch (action)
        {
            case "encode":
                System.out.println(Encode(str));
                break;
            case "decode":
                System.out.println(Decode(str));
        }


    }
    static boolean CompareStrings(String s1, String s2)
    {
        if (s1.equals(s2))
            return true;
        return  false;
    }

    static String Encode(String s)
    {
        String result = "";

        for (char c: s.toCharArray())
        {
            if (c == 'Z')
                result += 'A';
            else if (c == 'z')
                result += 'a';
            else if (c < 65 || c > 90 && c < 96 || c > 122)
                result += c;
            else
                result += (char)((int)++c);
        }
        return result;
    }
    static String Decode(String s)
    {
        String result = "";
        for (char c: s.toCharArray())
        {
            if (c == 'A')
                result += 'Z';
            else if (c == 'a')
                result += 'z';
            else if (c < 65 || c > 90 && c < 96 || c > 122)
                result += c;
            else
                result += (char)((int)--c);
        }
        return result;
    }

}
