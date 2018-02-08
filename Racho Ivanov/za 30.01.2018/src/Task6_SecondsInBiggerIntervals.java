import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int input = scn.nextInt();

        int d = input / 86400;
        int h = (input % 86400) / 3600;
        int m = (input %  3600) / 60;
        int s = input % 60;
        System.out.println(d + " days, " + h  + " hours, " + m + " minutes, " + s + " seconds");
    }
}

