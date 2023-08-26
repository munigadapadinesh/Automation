package Capgemini.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Common {
	static String exp_title="";
	
	
	public static WebDriver getDriver()
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		return driver;
	}
	
	public static String getpageTitle() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\mudinesh\\Desktop\\Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		exp_title=row.getCell(0).getStringCellValue();
		return exp_title;
	}
	
	public static boolean validatepageTitle() throws IOException
	{
		boolean flag=false;
		
		if(exp_title.equals(getDriver().getTitle()))
		{
			System.out.println("The Title is as per expected");
			flag=true;
		}
		else
		{
			System.out.println("The title is not as per expected");
			flag=false;
		}
		return flag;
	}

}
