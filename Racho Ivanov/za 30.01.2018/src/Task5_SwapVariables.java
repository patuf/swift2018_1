import java.util.Scanner;

public class Task5_SwapVariables
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String one = scn.next();
        String two = scn.next();

        //1
        String three =  one;
        one = two;
        two = three;

        System.out.println(one + " " + two);

        //2
        System.out.println(one = swap(two, two = one) + " " + two);
    }

    public static String swap( String s1, String  s2)
    {
        return s1;
    }
}
