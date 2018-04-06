package Task1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFileStructure
{
	public static void main(String[] args)
	{
		String path = "D:\\Programing\\Java\\Swift Cource\\Class Projects";
		File test = new File(path);

		List<File> fullList = new ArrayList<>();
		fullList.addAll(Arrays.asList(test.listFiles()));

		int counter = 0;
		while (counter < fullList.size())
		{
			counter = 0;
			List<File> temp = new ArrayList<>();
			for (File f: fullList)
			{
				if (f.isDirectory())
				{
					temp = getFilesFromFolder(f);
					fullList.remove(f);
					break;
				}
				counter++;
			}
			fullList.addAll(temp);
		}


		for (File f : fullList)
		{
			System.out.println(f);
		}

		for (int i = 0; i < 10; i++)
		{
			System.out.println();
		}

		for (File f: fullList)
		{
			String temp = f.getAbsolutePath().substring(path.length()+1, f.getAbsolutePath().length());
			System.out.println(temp);
		}

	}
	static List<File> getFilesFromFolder(File file)
	{
		return Arrays.asList(file.listFiles());
	}
}
