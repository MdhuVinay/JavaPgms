package pattern;

public class Flipkart 
{
	public static void main(String[] args)
	{
		String[] book= {"aa","aa","aa","aa","aa",};
		try 
		{
			for (int i = 0; i < book.length; i++) 
			{
				System.out.println(book[book.length]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
		}
		finally
		{
			System.out.println("OutOfStock");
		}
		
	}	
}
