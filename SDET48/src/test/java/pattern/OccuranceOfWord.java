package pattern;

public class OccuranceOfWord 
{
	public static void main(String[] args) 
	{
		String str = "My my name is rishav it contains ri and shav";
		String[] arr = str.split(" ");
		boolean[] frr = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if (frr[i] == false) 
			{
				int count = 0;
				for (int j = i; j < arr.length; j++)
				{
					if (arr[i].equalsIgnoreCase(arr[j])) 
					{
						count++;
						frr[j] = true;
					}
				}
				System.out.println(arr[i] +"-->>> " + count + " times repeated ");
			}
		}
	}
}
