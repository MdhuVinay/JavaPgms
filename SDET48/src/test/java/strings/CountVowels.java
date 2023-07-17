package strings;

public class CountVowels 
{
	public static void main(String[] args)
	{
		String s="tilak";
		char[] arr = s.toCharArray();
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') 
			{
				count++;

				
			}
		}
		System.out.println(count);		//no of vowel present
	}
}
