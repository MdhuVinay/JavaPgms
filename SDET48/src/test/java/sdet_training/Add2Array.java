package sdet_training;

public class Add2Array
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,8,8};
		int[] b= {5,6,7,8,9};
		int length= a.length;

		if (b.length>length)
		{
			length=b.length;
		}
		for (int i = 0; i < length; i++)
		{
			try 
			{
				System.out.println(a[i]+b[i]);
			} 
			catch (Exception e)
			{
				if (a.length>b.length)
				{
					System.out.println(a[i]);

				}
				else
				{
					System.out.println(b[i]);
				}
			}
		}



	}
}
