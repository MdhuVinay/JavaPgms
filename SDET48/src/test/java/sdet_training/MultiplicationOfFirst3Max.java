package sdet_training;

public class MultiplicationOfFirst3Max 
{
	public static void main(String[] args)
	{
		int[] arr= {3,4,2,5,1};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[j]>arr[i]) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int sum=1;
		for (int j = 0; j < 3; j++) 
		{
			sum=sum*arr[j];
		}
		System.out.println("the sum of first 3 max is  >>>   "+sum);

	}
}
