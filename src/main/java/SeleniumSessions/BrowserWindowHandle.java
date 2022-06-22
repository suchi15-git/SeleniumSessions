package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		//child window will be opened
		
		//window handler api
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> It = windowIds.iterator();
		
		String parentwindowId = It.next();
		System.out.println(parentwindowId);
		
		String childwindowId = It.next();
		System.out.println(childwindowId);
//		
//		String childTitle = driver.getTitle();
//		System.out.println(childTitle);
		
		//switch to child window
		driver.switchTo().window(childwindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
