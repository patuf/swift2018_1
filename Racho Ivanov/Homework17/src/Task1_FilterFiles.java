import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_FilterFiles
{
	public static void main(String[] args)
	{
		String[] input =
						{
						".bash_profile",
						"workspace.doc",
						"img0912.jpg",
						"updated_img0912.png",
						"documentation.html",
						"favicon.gif",
						"img0912.jpg.tmp",
						"access.lock"
						};

		String pattern = ".*\\.jpg|.*\\.png|.*\\.bmp?.*\\.gif";

		for (String s:input)
		{
			FilterFiles(s,pattern);
		}

	}

	static void FilterFiles(String input, String pattern)
	{
		Pattern pat = Pattern.compile(pattern);

		Matcher match = pat.matcher(input);

		while (match.find())
			System.out.println(match.group() + " " + match.start());
	}
}
