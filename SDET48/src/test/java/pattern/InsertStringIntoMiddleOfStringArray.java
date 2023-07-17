package pattern;

public class InsertStringIntoMiddleOfStringArray 
{
	public static void main(String[] args)
	{
		String[] arr= {"TIlak","TIlak","TIlak","TIlak","TIlak"};
		int len=arr.length+1;
		String[] emptyArr=new String[len];

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < emptyArr.length; j++) 
			{
				if (((arr.length)/2)==j)
				{
					emptyArr[j]="middle";
				}
				else
				{
					emptyArr[j]=arr[i];
				}
			}
		}
		for (int i= 0; i < emptyArr.length; i++)
		{
			System.out.print(emptyArr[i]+" ");
		}
	}
}
