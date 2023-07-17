package practice_EVE_seassion;

import java.util.TreeMap;

public class RemoveDuplicateUsingHashMap 
{
	public static void main(String[] args)
	{
		int[] arr= {2,5,3,4,1,7,3,6};
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			map.put(arr[i], i);
		}
		System.out.println(map.keySet());
	}
}
