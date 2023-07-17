package pattern;

public class FetchAllNumbersAndSUm {

	public static void test1() {
		String s="tilaklaxman4323400naik200";
		int sum=0;
		int tsum=0;
		for (int i = 0; i <= s.length()-1; i++)
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;
				tsum=(tsum*10)+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		//sum=sum+tsum; to get the sum
		sum=sum*tsum;		// to get the product of the number i na  array
		System.out.println(sum);

	}
	public static void test2() 
	{
		String s="tilak1laxman200naik200z";//401
		int sum=0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum = (sum*10)+n;
			}
			else {
				tsum=tsum+sum;
				sum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		test1();
	}
}

