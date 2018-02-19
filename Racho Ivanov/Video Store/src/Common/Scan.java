package Common;

import java.util.Scanner;

public class Scan
{
    static Scanner scn = new Scanner(System.in);

    public static String scan()
    {
        return scn.next();
    }

    public static int scanInt()
    {
        return scn.nextInt();
    }

    public static String scanString()
    {
        return scn.nextLine();
    }

    public static double scanDouble()
    {
        return scn.nextDouble();
    }
}
