import java.util.Scanner;

public class Task2_LeapYear
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter year: ");
        int input = reader.nextInt();
        reader.close();

        if (input % 4 == 0)
        {
            if (input % 100 == 0)
            {
                if (input % 400 == 0)
                    System.out.println(true);
                else
                    System.out.println(false);
            }
            else
                System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
