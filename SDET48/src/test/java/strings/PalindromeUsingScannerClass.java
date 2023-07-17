package strings;

import java.util.Scanner;

public class PalindromeUsingScannerClass 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s>>> ");
		String s = sc.next();
		String rev="";
		for (int i = s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if (rev.equals(s))
		{
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome ");

		}
	}
}
