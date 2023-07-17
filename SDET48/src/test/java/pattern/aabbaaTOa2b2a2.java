package pattern;

public class aabbaaTOa2b2a2 
{
	public static void main(String[] args) 
	{
		String s="aabbaa"; 		// can use in 2 ways by removing else block also 
		char[] arr=s.toCharArray();

		boolean[] frr=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if(frr[i]==false)
			{
				int count=0;
				for (int j = i; j < arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count++;
						frr[j]=true;
					}
					else break;
				}
				System.out.print(arr[i]+""+count+"");
			}

		}
	}}
