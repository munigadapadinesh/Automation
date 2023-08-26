package javascriptexecutorhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class highlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id='email']"));	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background='yellow'", ele);
		ele.sendKeys("Dinesh");
		
		
		
		
	

	}

}
