package Capgemini.Automation;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class todaypractice extends Common {
//static WebDriver driver;
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean flag=false;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver=getDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/register.php");
		flag=validatepageTitle();
		System.out.println(flag);
		WebElement ele=driver.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[1]/div/div/div[4]/div/div/div/div/div[2]"));
		Actions act=new Actions(driver);
	    ele.click();
		
		List<WebElement> lst=driver.findElements(By.xpath("//*[@class='country-list']/li"));
		for(WebElement ele1:lst)
		{
			System.out.println(ele1.getText());
			if(ele1.getText().contains("India"))
			{
				ele1.click();
			}
		}
		System.out.println(lst.size());
		
		}
}
