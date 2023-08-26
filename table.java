package Capgemini.Automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		
		
		
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(int i=0;i<rows.size();i++)
		{
		   String ss=rows.get(i).getText();
			System.out.println(ss);
			if(ss.contains("Selenium") || ss.contains("Ou"))
			{
				System.out.println("catch");
			}
		}
		

	}

}
