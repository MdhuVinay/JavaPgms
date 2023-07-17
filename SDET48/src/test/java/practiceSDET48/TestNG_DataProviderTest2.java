package practiceSDET48;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviderTest2 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr = new Object[3][4];

		arr[0][0]="admin1";
		arr[0][1]="un1";
		arr[0][2]="pwd1";
		arr[0][3]="status";


		arr[1][0]="admin2";
		arr[1][1]="un2";
		arr[1][2]="pwd2";
		arr[1][3]="status";

		arr[2][0]="admin3";
		arr[2][1]="un3";
		arr[2][2]="pwd3";
		arr[2][3]="status";

		return arr;

	}
@Test(dataProvider = "data")
public void test2(String name, String un, String pwd,String status)
{
	System.out.println(name+"  "+un+"  "+pwd+"  "+status);
}
}



