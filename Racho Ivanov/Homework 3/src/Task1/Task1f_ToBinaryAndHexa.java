package Task1;

import Common.Scan;

public class Task1f_ToBinaryAndHexa
{
    public static void main(String[] args)
    {
        int input = Scan.scanInt();

        int temp = input;
        String s = "";
        while(true)
        {

            if (temp == 1)
            {
                s = 1 + s;
                break;
            }
            s = temp%2 + s;
            temp /= 2;
        }

        System.out.println(s);

        temp = input;
        s = "";
        while(true)
        {

            if (temp < 16)
            {
                s = hexaNumbersOrLetters(temp % 16) + s;
                break;
            }
            s = hexaNumbersOrLetters(temp % 16) + s;
            temp /= 16;
        }
        System.out.println(s);
    }

    static char hexaNumbersOrLetters(int num)
    {
        if(num > 9 )
            num+=55;
        else
            num+=48;
        char c = (char)num;

        return c;
    }
}
