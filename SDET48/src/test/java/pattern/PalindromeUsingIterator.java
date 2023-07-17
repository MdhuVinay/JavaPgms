package pattern;
import java.util.ArrayList;
import java.util.ListIterator;
public class PalindromeUsingIterator
{
	public static void main(String[] args)
	{
		String s="Malayalam";
		s=s.toLowerCase();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		ListIterator<Character> iterator = list.listIterator();
		String rev="";
		while (iterator.hasNext()) 
		{	
			System.out.print(iterator.next());
		}
		System.out.println();
		while (iterator.hasPrevious())
		{
			Character previous = iterator.previous();
			rev=rev+previous;
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}
}

