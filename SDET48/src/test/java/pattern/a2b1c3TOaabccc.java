package pattern;

public class a2b1c3TOaabccc {
	public static void test1() {
		System.out.println("Reversing the string without using the third variable");
		String a="java";
		String b="python";
		a=a+b;//javapython
		b=a.substring(0,a.length()-b.length());//0,(4)
		a=a.substring(b.length());//5
		System.out.println(a);//python
		System.out.println(b);
	}
	public static void test2() 
	{
		System.out.println("Input is a2b2c2 And outpu should be aabbcc");
		String s="a2b1c3";			 //aaaabb
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length-1; i++)		
		{
			int count=0;
			if (Character.isDigit(arr[i+1]))		//if(arr[i+1]>='0' && arr[i+1]<='9')
			{
				count=arr[i+1]-48;

				for (int j = 0; j < count; j++)
				{
					System.out.print(arr[i]);
				}
			}
			
		}
	}
	public static void test3() {
		System.out.println();
		System.out.println("store the sum in astring and print its charector");
		int[] arr1= {1,2,3,4};
		int[] arr2= {9,8,7,6};		//1,0,1,0,1,0,1,0
		String s="";
		for (int i = 0; i < arr1.length; i++) {
			int s2 = arr1[i]+arr2[i];
			s=s+s2;
		}
		for (int j = 0; j < s.length(); j++) {
			if (j==s.length()-1) {
				System.out.print(s.charAt(j));		//to remove the comma at last

			} else {
				System.out.print(s.charAt(j)+", ");

			}
		}
	}
	public static void main(String[] args) {
		test1();	
		test2();
		test3();
	}

}
