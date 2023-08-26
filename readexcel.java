package java_prep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\mudinesh\\Downloads\\Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC :
					System.out.print(cell.getNumericCellValue() +"\t\t");
					break;
				case Cell.CELL_TYPE_FORMULA:
					System.out.print(cell.getDateCellValue() +"\t\t");
					break;
				case Cell.CELL_TYPE_STRING :
					System.out.print(cell.getStringCellValue() +"\t\t");
					break;
					
				}
			}
			System.out.println(" ");
		}
	}

}
