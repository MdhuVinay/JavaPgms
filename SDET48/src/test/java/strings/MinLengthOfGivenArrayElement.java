package strings;

public class MinLengthOfGivenArrayElement
{
	public static void main(String[] args) 
	{
		String[] arr={"ab","abcd","avcde","abcdde","fffff"};
		int min=arr[0].length();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].length()<min) 
			{
				min=arr[i].length();
			}
		}
		System.out.print(min);

	}
}
