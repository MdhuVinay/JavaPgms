package practiceSDET48;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviderTest 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr = new Object[3][3];
		
		arr[0][0]="admin1";
		arr[0][1]="un1";
		arr[0][2]="pwd1";
		
		arr[1][0]="admin2";
		arr[1][1]="un2";
		arr[1][2]="pwd2";
		
		arr[2][0]="admin3";
		arr[2][1]="un3";
		arr[2][2]="pwd3";
		
		return arr;
		
	}
	@Test(dataProvider = "data")
	public  void test1(String name, String un, String pwd)
	{
		System.out.println(name+"---->"+un+"---->"+pwd);
	}
}
