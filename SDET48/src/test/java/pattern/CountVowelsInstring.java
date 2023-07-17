package pattern;

import java.util.ArrayList;

public class CountVowelsInstring {
	public static void main(String[] args) {
		String[] srr= {"vivek","Vivek","Jawahar"};
		

		for (int i = 0; i <srr.length; i++) {
			String string = srr[i];
			int count=0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(j)=='a' || string.charAt(j)=='e' || string.charAt(j)=='i' 
						|| string.charAt(j)=='o' || string.charAt(j)=='u') {
					count++;
				}
			}
			System.out.println(string+" "+count);
		}

	}
}

