package practice_EVE_seassion;

import java.util.LinkedHashSet;

public class AlphabetsWithNumberOfTImesRepeated
{
	public static void main(String[] args)
	{
		String str="abcdab";					// output=a2b2c1d1
		LinkedHashSet<Character> hashset = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			hashset.add(str.charAt(i));
		}
		for(Character set:hashset)
		{
			int count=0;
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i)==set) 
				{
					count++;
				}
			}
			System.out.print(set+""+count);
		}
	}
}
