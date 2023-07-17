package strings;

import java.util.Iterator;

public class ReverseTheSentenceAndSwap
{
	public static void main(String[] args)
	{
		String s="I am Tilak Laxman Naik";
		String[] arr = s.split(" ");
		
		//swap first and last
		String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
