package strings;

public class Asst1RemoveDups 
{
	public static void main(String[] args)
	{
		String s="I am am a a Software Engineer";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i].equals(arr[j])) 
				{
					arr[j]="...";
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]!="...")
			{
				System.out.print(arr[i]+" ");
			}
		}

	}
}
