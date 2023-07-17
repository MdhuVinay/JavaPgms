package Pgms_Package;

public class Pattern11 
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

			for (int k=5; k>=1; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
