package strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ASST6PositionWithoutDuplicates
{
	public static void main(String[] args) 
	{
		int[] arr= {5,3,1,1,4,4,4,5,6};
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++)
		{
			h.add(arr[i]);
		}
		
		for(Integer set:h)
		{
			int count=0;
			for (int i = 0; i < arr.length; i++)
			{
				if (set==arr[i])
				{
					count++;
				}
			}
			if (count>1)
			{
				System.out.println(set+" "+count);

			}
		}
	}
}
