package sdet_training;

public class Sum11GivingElementFetch
{
	public static void main(String[] args) 
	{
		int[] a= {1,3,6,8,10};
		int c=11;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]+a[j]==c)
				{
					System.out.println("the elements gives 11 as sum are    "+a[i]+"  and  "+a[j]);
				}
			}
		}
	}
}
