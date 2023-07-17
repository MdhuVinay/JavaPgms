package strings;

public class MultiplicationOfFirst3Max 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,5,4,2,3};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int sum=1;
		for (int i = 0; i < 3; i++)
		{
			 sum=sum*arr[i];
		}
		System.out.println(sum);
	}
}
