package pattern;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccurenceOfEachLetter {
	public static void main(String[] args) {
		String s ="malayalam";
		int count=0;
		char output=0;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for ( Entry<Character, Integer> mapvalues : map.entrySet()) {
			System.out.println(mapvalues.getKey()+" "+mapvalues.getValue());
		}
	}
}
