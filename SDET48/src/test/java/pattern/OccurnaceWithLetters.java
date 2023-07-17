package pattern;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class OccurnaceWithLetters
{
	public static void map() {
		System.out.println("=================APPROACH 1================");
		String str="aweexxxyyyyyy";
		char[] charArray = str.toCharArray();
		LinkedHashMap<Character, Integer> linkedmap = new LinkedHashMap<Character, Integer>();
		for (char ch : charArray) {
			linkedmap.put(ch, linkedmap.getOrDefault(ch, 0)+1);
		}
		for ( Entry<Character, Integer> map : linkedmap.entrySet()) {
			System.out.print(map.getKey()+""+map.getValue());
		}
	}
	public static void collection() {
		System.out.println();
		System.out.println("=================APPROACH 2================");
		String s="aweexxxyyyyyy";
		s=s.toLowerCase();
		LinkedHashSet<Character> linkedset = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			linkedset.add(s.charAt(i));
		}
		System.out.println(linkedset);
		for (Character set : linkedset) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (set==s.charAt(i)) {
					count++;
				}
			}
			System.out.print(set+""+count);
		}
	}
	public static void normal() {
		System.out.println();
		System.out.println("=================APPROACH 3================");
		String s="aweexxxyyyyyy";
		char[] arr = s.toLowerCase().toCharArray();
		boolean[] frr=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (frr[i]==false) {
				int count=0;
				for (int j = i; j < frr.length; j++) {
					if (arr[i]==arr[j]) {
						count++;
						frr[j]=true;
					}
					else break;
				}
				System.out.print(arr[i]+""+count);
			}
		}
	}
	public static void main(String[] args) {
		map();
		collection();
		normal();
	}
}
