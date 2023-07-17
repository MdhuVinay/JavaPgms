package sdet_training;

public class Pgmmock2 
{
	public static void main(String[] args)
	{
		String s="AZa!@#$%a1AZ23334a1####23##";
		String var1="";
		String var2="";
		String var3="";

		for (int i = 0; i < s.length()-1; i++)
		{
			if (s.charAt(i)>=48 && s.charAt(i)<=57) 
			{
				var1=var1+s.charAt(i);	
			} 
			else if (s.charAt(i)>=65 && s.charAt(i)<=122) 
			{
				var2=var2+s.charAt(i);	
			}
			else
			{
				var3=var3+s.charAt(i);	
			}
		}
		System.out.println(var1+var2+var3);
	}
	
}
