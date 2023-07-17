package strings;

public class PositionOfEachWOrdWithoutDuplicates
{
	public static void main(String[] args) 
	{
		String s="I am am a a Software Enginner Enginner";
		String st = s.toLowerCase();
		String[] arr = st.split(" ");
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
				System.out.println(arr[i]+" the position is "+(i+1));
			}
		}
	}
}
