package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithListObject {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		
		//String parentWindowId= driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
//		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();

		//set to list converter
		
		List<String> windowList = new ArrayList<String>(handles);

		String parentWindowID = windowList.get(0);
		String childWindowID = windowList.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		driver.getCurrentUrl();
		driver.close();
	}

}
