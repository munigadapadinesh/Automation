package javascriptexecutorhandson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendkeysusingjavascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//WebElement webl = driver.findElement(By.name("email"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
	    //js.executeScript("arguments[0].value='Avinash Mishra';", webl);       1
		js.executeScript("document.getElementById('email').value='Dinesh';");   //2



		js.executeScript("document.getElementByName('q').value='Dinesh';");

	}

}
