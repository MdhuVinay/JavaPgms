package strings;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int n=7;
		int count=0;
		for (int i = 1; i <=n; i++)
		{
			if (n%i==0)
			{
				count++;
			}

		}
		if (count==2)
		{
			System.out.println(n+" is a primenumber");
		} else
		{
			System.out.println(n+" is not prime number");
		}
	}
}