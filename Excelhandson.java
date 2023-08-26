package Capgemini.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excelhandson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs=new FileInputStream("C:\\Users\\mudinesh\\Downloads\\Excel.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fs);
		XSSFSheet sheet=book.getSheet("Test");
	    //Find number of rows in excel file
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    
	    System.out.println(rowCount);

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i <=rowCount; i++) {

	        XSSFRow row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j <row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.println(row.getCell(j).getStringCellValue());

	        }

	        
	    } 

	}

}

