package Capgemini.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mudinesh\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'display an  alert box:')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Givingdata");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();		
	}

}
