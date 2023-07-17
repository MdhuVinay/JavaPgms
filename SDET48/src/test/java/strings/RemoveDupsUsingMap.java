package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDupsUsingMap
{
	public static void main(String[] args)
	{
		String str="ttiillaakkKKKK";
		String s = str.toLowerCase();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++)
		{
			map.put(s.charAt(i), i);
		}
		for(Entry<Character, Integer> set:map.entrySet())
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (s.charAt(i)==set.getKey())
				{
					count++;
				}
			}
			System.out.println(set.getKey()+" is repeating "+count+" times");
		}
	}
	
}
