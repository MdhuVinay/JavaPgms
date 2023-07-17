package practice_EVE_seassion;

public class First3MinWithoutBubbleSort
{
	public static void main(String[] args)
	{
		int[] arr= {0,0,3,4,5,6,2,7,1,0};
		int fmin=111;
		int smin=111;
		int tmin=111;

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]<fmin)
			{
				tmin=smin;
				smin=fmin;
				fmin=arr[i];
			}
			else if(arr[i]<smin)
			{
				smin=fmin;
				fmin=arr[i];
			}
			else
			{
				tmin=arr[i];
			}
		}
		System.out.println("1st 3 min numbers are "+fmin+"  "+smin+"  "+tmin);

	}
}
