package practice_EVE_seassion;

import java.util.LinkedHashSet;

public class SumOf2Equals10
{
	public static void main(String[] args)
	{
		int [] arr = {3,7,6,4,7,8};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			try
			{
				if (arr[i]+arr[i+1]==10)
				{
					set.add(arr[i]);
					set.add(arr[i+1]);
					System.out.println(arr[i]+" + "+arr[i+1]+" = 10");
				}
			} catch (Exception e)
			{
				
			}
		}
		
		
		
		
		

	}

}


