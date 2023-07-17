package pattern;

public class RemoveDupsLetter
{
	public static void main(String[] args)
	{
		String s="aabbaa";
		char[] arr = s.toCharArray();
		
		boolean[] frr=new boolean[arr.length];

		for (int i = 0; i < arr.length; i++)
		{
			if (frr[i]==false)
			{
				int count=0;
				for (int j = i; j < arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count++;
						frr[j]=true;
					}
				}
				System.out.print(arr[i]+""+count+"");
			}
		}
	}
}
