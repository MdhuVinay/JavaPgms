package pattern;

public class ReverseWIthItsIndex 
{
	public static void main(String[] args)
	{
		String s="I am Selenium";
		String[] splitArr = s.split(" ");  //iamselenium
		StringBuilder sb = new StringBuilder();
		for (String string : splitArr)
		{
			sb.append(string);
		}
		sb.reverse();
		String rev="";
		int position=0;
		
		for (int i = 0; i < splitArr.length; i++)
		{
			rev=rev+sb.substring(position, position+splitArr[i].length())+" ";
			position=position+splitArr[i].length();
		}
		System.out.println(rev);
		
		
	}
}
