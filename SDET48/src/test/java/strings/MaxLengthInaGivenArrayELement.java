package strings;

public class MaxLengthInaGivenArrayELement
{
	public static void main(String[] args) 
	{
		String[] arr={"ab","abcd","avcde","abcdde","fffff"};
		int max=arr[0].length();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].length()>max) 
			{
				max=arr[i].length();
			}
		}
		System.out.println(max);
		
	}
	

}
