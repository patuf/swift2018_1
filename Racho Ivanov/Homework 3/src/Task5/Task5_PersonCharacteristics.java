package Task5;

import java.util.Calendar;
import java.util.Scanner;

public class Task5_PersonCharacteristics
{
	public static void main(String[] args)
	{

		Scanner scn = new Scanner(System.in);

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {


			String fName = nameValidator(scn, "first name");
			String lName = nameValidator(scn, "last name");
			int yob = yearValidator(scn, currentYear);

			System.out.println("Enter weight : ");
			double weight = scn.nextDouble();

			System.out.println("Enter height : ");
			int height = scn.nextInt();

			String prof = nameValidator(scn, "profession");

			if(currentYear - yob > 18)
			System.out.println(fName + " " + lName + " is " + (currentYear - yob) + ". His weight is " + weight + " and he is "
							+ height + " cm tall. He is a " + prof + ".");
			else
				System.out.println(fName + " " + lName + " is under-aged.");
		}
	}
	public static String nameValidator(Scanner scn,String text)
	{
		boolean validate = true;

		String name = "";

		while (validate)
		{
			System.out.println("Enter" + text + " : ");

			name = scn.next();

			char[] nameLetters = name.toCharArray();

			if ((int) nameLetters[0] > 64 && (int) nameLetters[0] < 91)
				for (int i = 1; i < nameLetters.length; i++)
				{
					if ((int) nameLetters[i] > 96 && (int) nameLetters[i] < 123)
						validate = false;
					else
					{
						validate = true;
						break;
					}
				}
		}

		return name;
	}

	public static int yearValidator(Scanner scn, int currentYear)
	{
		int year = 0;
		boolean validator = true;

		while (validator)
		{
			System.out.println("Enter year of birth : ");
			year = scn.nextInt();

			if (year < currentYear && year > currentYear - 140)
				validator = false;
		}

		return year;
	}
}
