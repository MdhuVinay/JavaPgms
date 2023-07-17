package sdet_training;

public class FirstMax
{
	public static void main(String[] args)
	{
		int[] arr= {5,2,3,1,4};
		int max = arr[0];
		for (int j = 0; j < arr.length; j++)
		{
			if (max<arr[j]) 
			{
				int temp=arr[j];
				arr[j]=max;
				max=temp;
			}
		}
		System.out.println(max);

	}

}
