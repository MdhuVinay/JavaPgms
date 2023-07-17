package strings;

public class IndexBasedReversing
{
	public static void main(String[] args)
	{
		String s1="I am Tilak Naik";
//		String s = s1.replaceAll("\\s+", "");
		String[] arr = s1.split("\\s+");		



		//reverse the string after removed space
		StringBuffer sb = new StringBuffer(s).reverse();
		String str = sb.toString();
		//System.out.println(sb);


		//fetching the length of string and store it in brr[] array
		for (int i = 0; i <arr.length; i++)
		{
			int l = arr[i].length();
			int[] brr=new int[arr.length];
			brr[i]=l;							//[1,2,5,4]
			
			String[] crr=new String[brr.length]; 
			for (int k = 0; k < brr[i]; k++)
			{
				try
				{
					crr[k]=str.substring(i,brr[k]);
					System.out.print(crr[k]+" ");
				}
				catch (Exception e)
				{
				}
			}
			

		}
	}
}