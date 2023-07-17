package strings;

import java.util.LinkedHashSet;

public class PrintDuplicateWordsInAGivenString
{
	public static void main(String[] args)
	{
			String s="I am am a a Software Engineer";
			String[] arr = s.split(" ");
			int count=0;
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			for (int i = 0; i < arr.length; i++)
			{
				if (!set.add(arr[i]))
				{
					count++;
				}
			}
			System.out.println(count);

	}
}
