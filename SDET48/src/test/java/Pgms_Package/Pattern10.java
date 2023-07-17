package Pgms_Package;

public class Pattern10
{
	public static void main(String[] args)
	{
		int n=5;
		int star=4;
		int space=1;
		for (int i = 1; i <=n; i++)
		{
			for (int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <=star; k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
			star--;
			space++;
		}

	}
}