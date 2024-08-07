package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
	 // Specify the location of excel file	
	 File src = new File("C:\\Data\\TestData.xlsx");
	 // load file
	 FileInputStream fis = new FileInputStream(src);
	 // load workbook
	 //XSSFWorkbook wb = new XSSFWorkbook(fis);
	}

}
