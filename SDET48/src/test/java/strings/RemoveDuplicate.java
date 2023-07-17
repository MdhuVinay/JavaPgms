package strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicate 
{
	public static void main(String[] args)
	{
		String s="ttiillaakk";
		LinkedHashSet<Character> ts = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length()-1; i++)
		{
			ts.add(s.charAt(i));
		}
		System.out.println(ts);
	}
}