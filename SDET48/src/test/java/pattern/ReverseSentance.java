package pattern;

public class ReverseSentance
{
	public static void main(String[] args)
	{
		String s="welcome to expleo"; //output="expleo to welcome"
		String[] arr = s.split(" ");
		for (int i = arr.length-1; i >=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
