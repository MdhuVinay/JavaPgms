package Pgms_Package;

public class Pgm7 
{
	public static void main(String[] args) 
	{
		int n=9;
		int star=1;
		int space=n/2;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=star; k++) 
			{
				System.out.print("* ");
			}
		

				if (i<=n/2)
				{
					star=star+1;
					space--;
				}
				else
				{
					star=star-1;
					space++;
				}
				System.out.println();
			}

		

	}
}
