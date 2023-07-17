package Pgms_Package;

public class Pgm4HalfROumbus
{
	public static void main(String[] args)
	{
		int n=5;
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
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}









		//ex--2
		for (int i = 1; i <=n; i++)//for line
		{
			for (int j = 1; j <=(n-i); j++)//for spqce
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=i; k++) // for values
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
