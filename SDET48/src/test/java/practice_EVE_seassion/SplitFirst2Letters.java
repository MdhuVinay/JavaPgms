package practice_EVE_seassion;

import java.util.Iterator;

public class SplitFirst2Letters
{
	public static void main(String[] args) {


		String a="aaabbb";										// in nd di ia
		for (int j = 0; j < a.length(); j++) 
		{
			try
			{
				System.out.println(Character.toString(a.charAt(j))+a.charAt(j+1));
			} 
			catch (Exception e) 
			{

			}
		}
		
	
		
		
	}
}

