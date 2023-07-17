package sdet_training;

public class Pgmmock 
{
	public static void main(String[] args)
	{
		int[] arr= {1,0,1,0,0};
		int[] abb= new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]==1) 
			{
				abb[n]=arr[i];
				n--;
			} 
			else
			{
				abb[m]=arr[i];
				m++;
			}
		}
		for (int i = 0; i < abb.length; i++) 
		{
			System.out.print(abb[i]+" ");
		}
	}
}
