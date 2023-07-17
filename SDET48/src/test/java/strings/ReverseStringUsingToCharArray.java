package strings;

public class ReverseStringUsingToCharArray
{
	public static void main(String[] args)
	{
		String s="Tilak";
		char[] ch=s.toCharArray();
		for (int j = ch.length-1; j >=0; j--)
		{
			System.out.print(ch[j]);
		}

	}
}
