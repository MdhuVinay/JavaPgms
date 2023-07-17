package strings;

import java.util.LinkedHashSet;

public class PositionwithoutDups 
{
	public static void main(String[] args)
	{
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			for (int i = s.length()-1;i >=0; i--)
			{
				if (c==s.charAt(i))
				{
					count++;
				}
				if(count>1) {
				System.out.println(c+" = "+count);
				break;
			}


		}

	}
}
