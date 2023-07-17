package practice_EVE_seassion;

import java.util.Iterator;

public class First3MinUsingBubbleSort
{
	public static void main(String[] args)
	{
		int[] arr= {2,5,3,4,1,7,3,6};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("1St 3 min numbers are");
		for (int i = 0; i < 3; i++) 
		{
			if (arr[i]!=111)
			{
				System.out.println(arr[i]+" ");
			}
		}

	}
}
