package Task1;
import Common.Scan;

public class Task1d_PrintAllDivisions
{
    public static void main(String[] args)
    {
        int input = Scan.scanInt();

        for (int i = 1; i <= input; i++)
        {
            if (input % i == 0)
                System.out.print( i + " ");
        }
    }
}
