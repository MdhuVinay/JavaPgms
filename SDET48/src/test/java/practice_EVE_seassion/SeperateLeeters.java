package practice_EVE_seassion;

public class SeperateLeeters 
{
	public static void approach1()
	{
		String s="TilakLaxmanNaik@123";
		System.out.println("...........Approach1...................");
		String uc="";
		String lc="";
		String dg="";
		String sc="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);

			if (ch>='a' && ch<='z') 
			{
				uc=uc+ch;
			} 
			else if (ch>='A' && ch<='Z')
			{
				lc=lc+ch;
			}
			else if (ch>='0' && ch<='9') 
			{
				dg=dg+ch;
			}
			else
			{
				sc=sc+ch;
			}
		}
		System.out.println("UpperCase letters are    => "+uc);
		System.out.println("LowerCase letters are    => "+lc);
		System.out.println("Digits are               => "+dg);
		System.out.println("SpecialCase letters are  => "+sc);
	}
	
	public static void approach2() 
	{
		String s="TilakLaxmanNaik@123";
		System.out.println();
		System.out.println("...........Approach2...................");
		String uc="";
		String lc="";
		String dg="";
		String sc="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) 
			{
				uc=uc+ch;
			}
			else if(Character.isLowerCase(ch))
			{
				lc=lc+ch;
			}
			else if (Character.isDigit(ch))
			{
				dg=dg+ch;
			}
			else 
			{
				sc=sc+ch;
			}
		}
		System.out.println("UpperCase letters are    => "+uc);
		System.out.println("LowerCase letters are    => "+lc);
		System.out.println("Digits are               => "+dg);
		System.out.println("SpecialCase letters are  => "+sc);
	}
	public static void approach3()
	{
		String s="TilakLaxmanNaik@123";
		System.out.println();
		System.out.println("...........Approach3...................");
		String uc="";
		String lc="";
		String dg="";
		String sc="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch>=65 && ch<=90)
			{
				uc=uc+ch;
			}
			else if (ch>=97 && ch<=122)
			{
				lc=lc+ch;
			}
			else if (ch>=48 && ch<=57)
			{
				dg=dg+ch;
			}
			else 
			{
				sc=sc+ch;
			}
		}
		System.out.println("UpperCase letters are    => "+uc);
		System.out.println("LowerCase letters are    => "+lc);
		System.out.println("Digits are               => "+dg);
		System.out.println("SpecialCase letters are  => "+sc);

	}
	public static void main(String[] args)
	{
		approach1();
		approach2();
		approach3();
	}
}	

