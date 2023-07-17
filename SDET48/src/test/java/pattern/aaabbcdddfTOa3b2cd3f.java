package pattern;

public class aaabbcdddfTOa3b2cd3f
{
	public static void main(String[] args)
	{
		String s="aaabbcdddfa";		// output is a3b2cd3f1
		char first=s.charAt(0);
		int count=1;
		String str="";
		for (int i = 1; i < s.length(); i++)
		{
			char next = s.charAt(i);
			if (first==next)
			{
				count++;
			}
			else 
			{
				str=str+first+count;
				first=next;
				count=1;
			}
		}
		str=str+first+count;
		System.out.print(str+"");
	}
}