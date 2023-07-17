package practiceSDET48;

import org.testng.annotations.DataProvider;

public class TestNG_DataProvider_Test2A
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] arr = new Object[4][4];
		
		arr[0][0]="admin1";
		arr[0][1]="un1";
		arr[0][2]="pwd1";
		arr[0][3]="status";

		
		arr[1][0]="admin1";
		arr[1][1]="un1";
		arr[1][2]="pwd1";
		arr[1][3]="status";
		
		arr[2][0]="admin1";
		arr[2][1]="un1";
		arr[2][2]="pwd1";
		arr[2][3]="status";

		arr[3][0]="admin1";
		arr[3][1]="un1";
		arr[3][2]="pwd1";
		arr[3][3]="status";
		
		return arr;
		
	}
	
}
