package strings;

public class PositionWithChare
{
	public static void main(String[] args)
	{
		String s="Tester";
		String st = s.toLowerCase();
		for (int i = 0; i < st.length(); i++)
		{
			for (int j = 0; j < st.length(); j++) 
			{
				if (st.charAt(i)==st.charAt(j))
				{
					st.charAt(j)='z';
				}
			}
		}
		for (int k = 0; k < st.length(); k++)
		{
			System.out.println(st.charAt(k)+"  "+(k+1));

		}
	}
}
