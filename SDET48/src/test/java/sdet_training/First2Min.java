package sdet_training;

public class First2Min
{
	public static void main(String[] args)
	{
		int[] arr= {0,5,3,4,1,2,-1,-2};
		int firstmin=arr[0];
		int secondmin=arr[0];

		for (int i = 0; i < arr.length; i++)
		{
			if(firstmin>arr[i])
			{
				secondmin=firstmin;
				firstmin=arr[i];
			}
			else 
			{
				if (secondmin>arr[i])
				{
					secondmin=arr[i];
				}
			}
		}
		System.out.println(firstmin);
		System.out.println(secondmin);

	}

}
