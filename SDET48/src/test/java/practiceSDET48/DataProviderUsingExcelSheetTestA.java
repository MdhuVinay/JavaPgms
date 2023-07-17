package practiceSDET48;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import ujetix.genericUtils.IPathConstants;

public class DataProviderUsingExcelSheetTestA
{
	@DataProvider
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("DataProvider");
		int lastRow = sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastCell];
		for (int i = 0; i < lastRow; i++)
		{
			for (int j = 0; j < lastCell; j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}
