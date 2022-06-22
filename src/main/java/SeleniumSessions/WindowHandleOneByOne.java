package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleOneByOne {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		 Set<String> handle1 = driver.getWindowHandles();
		 Iterator<String> it = handle1.iterator();
		 String parentWindowId = it.next();
		 String childWindowId = it.next();
		 
		 driver.switchTo().window(childWindowId);
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 
		 driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();

	}
	
	public static void navigateToWindow() {
		 Set<String> handle1 = driver.getWindowHandles();
		 Iterator<String> it = handle1.iterator();
		 String parentWindowId = it.next();
		 String childWindowId = it.next();
		 
		 driver.switchTo().window(childWindowId);
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 
		 
	}

}
