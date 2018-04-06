import javax.swing.text.StyledEditorKit;
import java.util.*;

public class UniqueMembers
{
	public static void main(String[] args)
	{
		Scanner scn = new  Scanner(System.in);

		Set<Integer> nums = new HashSet<>();


		int temp = 0;
		temp = scn.nextInt();

		for (int i = 0; i < temp; i++)
		{
			nums.add(scn.nextInt());
		}

		for (Integer i: nums)
		{
			System.out.println(i + " ");
		}
	}
}
