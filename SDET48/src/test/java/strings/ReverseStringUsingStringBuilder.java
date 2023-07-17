package strings;

public class ReverseStringUsingStringBuilder
{
	public static void main(String[] args)
	{
		String s="Tilak";
		StringBuilder sbui = new StringBuilder();
		sbui.append(s);
		sbui.reverse();
		System.out.println(sbui);
		
		StringBuffer sbf = new StringBuffer(s);
		sbf.reverse();
		System.out.println(sbf);
	}
}
