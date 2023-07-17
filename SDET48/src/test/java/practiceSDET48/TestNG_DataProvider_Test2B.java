package practiceSDET48;

import org.testng.annotations.Test;

public class TestNG_DataProvider_Test2B 
{
	@Test(dataProviderClass = TestNG_DataProvider_Test2A.class, dataProvider = "data")
	private void test2(String name, String un, String pwd, String status)
	{
		System.out.println(name+"  "+un+"  "+pwd+"  "+status);
	}
}
