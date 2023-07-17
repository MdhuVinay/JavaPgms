package pattern;

public class RemoveWordString
{
	public static void main(String[] args)
	{
		String[] arr= {"I", "I", "am", "am", "Tilak", "Tilak"};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					arr[j]="TLN";	
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]!="TLN")
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
