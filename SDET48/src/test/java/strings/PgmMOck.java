package strings;

public class PgmMOck
{
	public static void main(String[] args) 
	{
		String s="hello india";
		int count=0;
		for(int i=0; ;i++)
		{
			try {
				s.charAt(i);
				count++;
			}
			catch (Exception e)
			{
				break;}

		}
		System.out.println(count);

	}
}