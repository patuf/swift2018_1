package Task1;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String number = scn.next();

        System.out.println(new StringBuilder(number).reverse());
    }
}
