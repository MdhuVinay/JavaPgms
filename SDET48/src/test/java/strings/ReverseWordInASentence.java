package strings;

public class ReverseWordInASentence
{
	public static void main(String[] args)
	{
		String s="I am Tilak Laxman Naik";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++)
		{
			String rev="";
			for (int j = arr[i].length()-1; j >=0; j--)
			{
				rev=rev+arr[i].charAt(j);
			}
			arr[i]=rev;
			System.out.print(arr[i]+" ");
		}
		
	}
}
