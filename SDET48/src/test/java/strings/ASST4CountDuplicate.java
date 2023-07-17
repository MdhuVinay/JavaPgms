package strings;

import java.util.LinkedHashSet;

public class ASST4CountDuplicate 
{
	public static void main(String[] args)
	{
		int[] arr= {5,3,1,1,4,5,6};

		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		int count=0;
		for (int a:arr)
		{
			if (!h.add(a)) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
