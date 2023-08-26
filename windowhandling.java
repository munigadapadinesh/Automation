package Capgemini.Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mudinesh\\Downloads\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/windows/");
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parent window" +driver.getWindowHandle());
		
		driver.findElement(By.linkText("new window")).click();
		
		Set <String> s=driver.getWindowHandles();
		
		Iterator<String>i=s.iterator();
		
		while(i.hasNext())
		{
			String childwindow=i.next();
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println("Child window" + driver.getWindowHandle());
				System.out.println(driver.getTitle());
				driver.close();
			}				
		}
		driver.switchTo().window(parentwindow);
		}
}
