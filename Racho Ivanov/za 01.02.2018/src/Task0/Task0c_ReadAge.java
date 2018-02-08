package Task0;

import java.util.Scanner;

public class Task0c_ReadAge
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();

        if (age < 18)
            System.out.print("Underaged");
        else
            System.out.println("Let the drinking begin");
    }
}
