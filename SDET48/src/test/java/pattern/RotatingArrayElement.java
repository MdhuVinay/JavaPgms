package pattern;

import java.util.Arrays;

public class RotatingArrayElement
{
	public static void main(String[] args)
	{
		app1();
		app2();
		app3();
	}
	public static void app1()
	{
		System.out.println("======Approach-1=======");
		int[] arr= {1,2,3,4,5};
		int run=2;
		for (int i = 0; i <run; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				try {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
				catch (Exception e)
				{
				}		
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void app2() {
		System.out.println();
		System.out.println("======Approach-2=======");
		int[] arr= {1,2,3,4,5};
		int run=2;
		for (int i = 0; i < run; i++) {
			for (int j = 0; j < arr.length-1; j++) {		//Changes done here
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void app3() {
		System.out.println();
		System.out.println("======Approach-3=======");
		int[] arr= {1,2,3,4,5};
		int run=2;
		while (run>0) {
			for (int i = 0; i < arr.length-1; i++) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			run--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
