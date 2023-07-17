package practice_EVE_seassion;

public class StringPrintBasedOnIndex 
{
	public static void main(String[] args)
	{
		String s="india";
		for (int i = 0; i < s.length(); i++)//itteration
		{
			for (int j = 0; j < s.length(); j++) //no of lines 
			{
				for (int k = i; k <=j; k++)//no of values in one line
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
			
		}
	}
}
