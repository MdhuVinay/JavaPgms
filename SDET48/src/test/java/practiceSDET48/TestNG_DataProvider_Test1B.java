package practiceSDET48;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider_Test1B 
{
	@Test(dataProviderClass = TestNG_DataProvider_Test1A.class, dataProvider = "data")
	public void test2(String name, String un, String pwd)
	{
		System.out.println(name+"  "+un+"  "+pwd);
	}
}
