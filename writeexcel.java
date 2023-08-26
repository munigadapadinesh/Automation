package excelhandson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\mudinesh\\Downloads\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		Cell cell=row.getCell(1);
		cell.setCellValue("Updated");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\mudinesh\\Downloads\\Data.xlsx");
		wb.write(fos);
		fos.close();
		
		
	}

	}


