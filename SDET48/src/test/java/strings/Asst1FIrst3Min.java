package strings;

public class Asst1FIrst3Min
{
	public static void main(String[] args)
	{
		int[] arr= {5,3,4,2,1,9};
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
			else if (arr[i]<smin)
			{
				tmin=smin;
				smin=arr[i];
			}
		}
		int sum=fmin+smin+tmin;
		System.out.println(sum);

	}
}
