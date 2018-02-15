package Task0;

public class Task0d_Print2dArray
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 17; i++)
		{
			if(i % 4 ==0)
				System.out.println();
			else
				System.out.print(i + " ");
		}
	}
}
