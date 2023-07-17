package Pgms_Package;

public class Pgm5UltaRombous
{
	public static void main(String[] args)
	{
		int n=5;
		int star=5;
		int space=1;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=star; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
		
		
		
		//eg2
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
