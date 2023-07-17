
package practice_EVE_seassion;

public class indexIndia 
{
	public static void main(String[] args) 
	{
		String s="india";
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j <s.length(); j++) 
			{
				for (int k = i; k <=j; k++)
				{
					System.out.print(s.charAt(k)+" ");
				}
				System.out.println();
			}
		}
		
	}
}
