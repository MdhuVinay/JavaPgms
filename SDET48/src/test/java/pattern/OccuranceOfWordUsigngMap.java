package pattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceOfWordUsigngMap 
{
	public static void main(String[] args)
	{
		String str = "My my name is rishav it contains ri and shav";
		str=str.toLowerCase();
		String[] splitArr = str.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for (String string : splitArr)
		{
			map.put(string, map.getOrDefault(string, 0)+1);
		}
		for ( Entry<String, Integer> hashmap : map.entrySet())
		{
			System.out.println(hashmap.getKey()+" "+hashmap.getValue());
		}
	}
	
}
