import java.util.Scanner;

public class Task4_InchToCm
{
    public static void main(String[] args)
    {
        System.out.println("Enter inches to see centimeters");
        Scanner rder = new Scanner(System.in);
        double input = rder.nextDouble();

        System.out.println(input * 2.54d);
    }
}
