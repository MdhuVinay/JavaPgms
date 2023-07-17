package strings;

public class ASST3RemoveDuplicateFromIntigerArray 
{
	public static void main(String[] args)
	{
		int[] arr= {5,3,1,1,4,5,6};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j])
				{
					arr[j]=111;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) 
		{
			if (arr[k]!=111)
			{
				System.out.print(arr[k]+" ");
			}
		}
	}
}
