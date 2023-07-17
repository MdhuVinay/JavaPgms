package pattern;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintOnlyDups
{
	public static void main(String[] args)
	{
		String str="abcdaca";
		char[] arr = str.toCharArray();
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for (char string : arr)
		{
			hashMap.put(string, hashMap.getOrDefault(string, 0)+1);
		}
		
		for (Entry<Character, Integer> e : hashMap.entrySet()) {
			if (e.getValue()>1) 
			{
				System.out.print(e.getKey()+" ");
			}
		}
	}
}