import java.util.*;

public class Task5_ChildPlay
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		int size = scn.nextInt();
		List<Integer> children = new ArrayList<>();

		for (int i = 0; i < size; i++)
		{
			children.add(scn.nextInt());
		}

		boolean finish = false;
		int count = -1;
		do
		{
			for (int i = children.size()-1; i > 0; i--)
			{
				if (children.get(i) < children.get(i-1))
				{
					children.remove(children.get(i));
				}
				count++;
			}
		}while (finish);

		System.out.println(count);
	}
}

