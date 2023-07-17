package strings;

import java.util.LinkedHashSet;

public class Asst3PositionOfEachWordInAString//without duplicates
{
	public static void main(String[] args)
	{
		String s="I am am a a Software Engineer";
		String[] arr = s.split(" ");

		LinkedHashSet<String> ts = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++)
		{
			ts.add(arr[i]);
		}
		
		for(String c:ts)
		{
			int count=0;
			for (int i = 0; i < arr.length; i++)
			{
				if (c.equals(arr[i]))
				{
					count++;
				}
			}
			if (count>1) 
			{
				System.out.println(c+"  "+count);
			}
		}
	}
}
