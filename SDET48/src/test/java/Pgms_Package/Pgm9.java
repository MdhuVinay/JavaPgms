package Pgms_Package;

public class Pgm9
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j =1; j <=n-i; j++) 
			{
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		//int n=5;
		int star=1;
		int space=4;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=star; k++) 
			{
				System.out.print(k+"");
			}
			System.out.println();
			star++;
			space--;
	}
	}}
