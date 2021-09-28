package Com.SWAG.Utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	XSSFWorkbook wb;
	
	public ExcelReader() 
	{
		File scr = new File("./TestData/CredentialsTestData.xlsx");
		FileInputStream srcFile;
		try {
			srcFile = new FileInputStream (scr);
		
	 wb = new XSSFWorkbook(srcFile);
		} catch (Exception e) {
			System.out.println(" Excel is not Loaded Correctly " + e.getMessage());
			
		}

		
		
	}
	
	public String ReadExcelData(String SheetName , int Row, int Col)
	{
		return wb.getSheet(SheetName).getRow(Row).getCell(Col).getStringCellValue();
	}
	

}
