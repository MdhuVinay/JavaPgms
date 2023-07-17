package strings;

import java.util.LinkedHashSet;

public class CountTHeDUplicates2
{
	public static void main(String[] args)
	{
		String s="tester";
		LinkedHashSet<Character> ts = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			ts.add(s.charAt(i));
		}
		for(Character c:ts)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if (c==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(c+""+count);
		}
	}
}
