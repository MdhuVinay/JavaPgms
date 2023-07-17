package sdet_training;

public class FIrsrmin
{
	public static void main(String[] args)
	{
		int[] arr= {5,2,3,1,4};
		int small = arr[0];
		for (int j = 0; j < arr.length; j++)
		{
			if (small>arr[j]) 
			{
				int temp=arr[j];
				arr[j]=small;
				small=temp;
			}
		}
		System.out.println(small);

	}
}
