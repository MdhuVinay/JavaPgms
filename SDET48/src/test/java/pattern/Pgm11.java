package pattern;

public class Pgm11
{
	public static void main(String[] args)
	{
		String s="aabbc";  //a2b2c1
		char first = s.charAt(0);
		int count=1;
		String r="";
		for (int i = 1; i < s.length(); i++)
		{
			char next = s.charAt(i);
			if (first==next)
			{
				count++;
			} 
			else
			{
				r=r+first+count;
				first=next;
				count=1;
			}
		}
		r=r+first+count;
		System.out.println(r);
		
	}
}
