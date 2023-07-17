package pattern;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDupsOfStringLengthIs2 {
	public static void main(String[] args) {
		String s="abcdaaegdaag";
		ArrayList<String> list = new ArrayList<String>();
		try {
			for (int i = 0; i < s.length(); i++) {
				list.add(s.substring(i, i+2));
			}
		} catch (Exception e) {
		}
		System.out.println(list);
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
	}
}
