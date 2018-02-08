
import java.util.Scanner;
import java.util.Calendar;

public class Task7_PersonCharacteristics
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String fName = scn.next();

        System.out.println("Enter last name : ");
        String lName = scn.next();

        System.out.println("Enter year of birth : ");
        int yob = scn.nextInt();

        System.out.println("Enter weight : ");
        double weight = scn.nextDouble();

        System.out.println("Enter height : ");
        int  height = scn.nextInt();

        System.out.println("Enter profession : ");
        String prof = scn.next();

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(fName + " " + lName + " is " + (year - yob) + ". His weight is " + weight + " and he is "
        + height + " cm tall. He is a " + prof + ".");
    }
}
