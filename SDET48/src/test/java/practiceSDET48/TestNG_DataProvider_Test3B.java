package practiceSDET48;

import org.testng.annotations.Test;

public class TestNG_DataProvider_Test3B 
{
	@Test(dataProviderClass = TestNG_DataProvider_Test3A.class, dataProvider = "data")
	public void test3(String name, Sring un, String pwd, String status1, String status2) 
	{
		System.out.println(name+"  "+un+"  "+pwd+"  "+"  "+status1+"  "+status2);
	}
	
}
