package javascriptexecutorhandson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flashelement {
	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			         driver.manage().window().maximize();
			         driver.manage().deleteAllCookies();
			         
			         driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			         driver.get("https://www.facebook.com/");
			         
			         driver.findElement(By.id("email")).sendKeys("piushkaushik@gmail.com");
			         driver.findElement(By.id("pass")).sendKeys("123456789");
			         
			         
			  
			          
			         
			         WebElement loginBtn = driver.findElement(By.xpath("//*[@name='login']")); 
			         flash(loginBtn, driver); 
			         
			        

			     }
			     public static void flash(WebElement element, WebDriver driver) {
			         
			         JavascriptExecutor js = ((JavascriptExecutor)driver);
			         String bgcolor = element.getCssValue("backgroundColor");
			         for (int i = 0; i < 100; i++) {
			             changeColor("rgb(0,200,0)", element, driver); 
			             changeColor(bgcolor, element, driver); 
			             
			         }
			     }
			         public static void changeColor(String color, WebElement element, WebDriver driver) {
			             JavascriptExecutor js = ((JavascriptExecutor)driver);
			             js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			             try {
			                 Thread.sleep(20);
			           
			             }catch (InterruptedException e) {
			               
			         }
			     
			 }
	}