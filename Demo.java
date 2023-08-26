package Capgemini.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mudinesh\\Downloads\\Driver\\chromedriver.exe"); //setting up the chrome driver path

		//System.setProperty("webdriver.gecko.driver", "PATH");
		//System.setProperty("webdriver.ie.driver", "PATH");
		
		WebDriver driver = new ChromeDriver();//Initialising driver
		
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new InterExplorerDriver();
		
		driver.manage().window().maximize();  //maximise the browser window

		driver.get("http://demo.automationtesting.in/Register.html");//launching website
		//driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		boolean ele= driver.findElement(By.xpath("//*[@placeholder='First Name']")).isDisplayed();
		System.out.println(ele);
	
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Test");
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Test");
		
		
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Plan");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("12-45-4223");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("fd@gmail.com");
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("5678342123");    //sendkeys method
		driver.findElement(By.xpath("//*[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();  // locator id 
		driver.findElement(By.id("checkbox2")).click();
		
		// Selecting the values from Dropdown

		Select skill = new Select(driver.findElement(By.id("Skills")));
		skill.selectByVisibleText("Adobe InDesign");
		skill.selectByIndex(2);
		skill.selectByValue("AutoCAD");

		driver.findElement(By.xpath("//*[@id='msdd']")).click();  //click operation
		driver.findElement(By.xpath(
				"(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li)[3]"))
				.click();
		
		

		Select country = new Select(driver.findElement(By.id("country")));

		country.selectByValue("Denmark");
		Thread.sleep(4000);
		country.selectByVisibleText("New Zealand");
		Thread.sleep(4000);
		

		Select year = new Select(driver.findElement(By.xpath("//*[@placeholder='Year']")));
		year.selectByIndex(3);

		Select month = new Select(driver.findElement(By.xpath("//*[@placeholder='Month']")));
		month.selectByValue("March");

		Select day = new Select(driver.findElement(By.xpath("//*[@placeholder='Day']")));

		day.selectByVisibleText("10");

		
		driver.findElement(By.xpath("//*[@name='signup']")).click();
		driver.findElement(By.xpath("//*[text()='Refresh']")).click();
       // driver.close();
		
		
		
       
	}

}
