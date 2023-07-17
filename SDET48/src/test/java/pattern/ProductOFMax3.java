package pattern;

public class ProductOFMax3 
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,-5,9};
		int fmax=arr[0];
		int smax=arr[0];
		int tmax=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (fmax<arr[i])
			{
				tmax=smax;
				smax=fmax;
				fmax=arr[i];
			}
			else if (smax<arr[i])
			{
				tmax=smax;
				smax=arr[i];
			}
			else 
			{
				tmax=arr[i];
			}
		}
		System.out.println(fmax*smax*tmax);
	}
}
