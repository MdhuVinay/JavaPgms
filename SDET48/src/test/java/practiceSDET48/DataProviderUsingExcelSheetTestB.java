package practiceSDET48;

import org.testng.annotations.Test;

import ujetix.genericUtils.ExcelUtility;

public class DataProviderUsingExcelSheetTestB
{
	@Test(dataProviderClass = DataProviderUsingExcelSheetTestA.class,dataProvider = "data")
	public void ExcelData(String name, String un, String pwd)
	{
		System.out.println(name+"  "+un+"  "+pwd);		
	}
}
