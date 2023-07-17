package practiceSDET48;

public class aabbabTOa2b2a1b1 
{
	public static void main(String[] args)
	{
		String s="aaabbcabbccc";
		char first = s.charAt(0);
		String str="";
		int count=1;
		
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
		System.out.print(str);
	}
}
