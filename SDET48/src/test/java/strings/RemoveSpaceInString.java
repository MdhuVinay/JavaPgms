package strings;

public class RemoveSpaceInString 
{
	public static void main(String[] args)
	{
		String s="I am Tilak Laxman Naik";
		String[] st = s.split(" ");
		for (int i = 0; i < st.length; i++) 
		{
			System.out.print(st[i]+" ");
		}
	}
}
