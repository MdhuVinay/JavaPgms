package strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicates
{
	public static void main(String[] args)
	{
		String s="bangalore";		
		LinkedHashSet<Character> h = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			h.add(s.charAt(i));
		}
		ArrayList<Character> l = new ArrayList<Character>(h);
		
		//vowels count
		int count=0;
		
		for(Character m:l)
		{
			if (m=='a' || m=='e' || m=='i' || m=='o' || m=='u') 
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
