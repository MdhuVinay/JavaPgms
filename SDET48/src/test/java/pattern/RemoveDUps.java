package pattern;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDUps
{
	public static void main(String[] args)
	{
		String s="TilakTilak";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					arr[j]='z';	
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]!='z')
			{
				System.out.print(arr[i]+"");
			}
		}
	}
}
