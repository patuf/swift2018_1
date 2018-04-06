import javax.swing.text.StyledEditorKit;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonSubset
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int inputs1 = scn.nextInt();
		int inputs2 = scn.nextInt();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < inputs1; i++)
		{
			set1.add(scn.nextInt()) ;
		}
		for (int i = 0; i < inputs2; i++)
		{
			set2.add(scn.nextInt());
		}

		boolean check = false;
		for (Integer i : set1)
		{
			if (set2.contains(i))
			{
				System.out.println(i + " ");
				check = true;
			}
		}

		if (!check)
			System.out.println("NO");
	}
}

