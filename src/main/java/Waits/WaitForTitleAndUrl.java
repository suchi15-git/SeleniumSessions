package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleAndUrl {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		driver.findElement(By.linkText("CONTACT SALES")).click();

		String title = waitForTitleContains("Contact", 10);
		System.out.println(title);
		
		String completeTitle = waitForTitleIs("Contact OrangeHRM",10);
		System.out.println(completeTitle);
	

	}
	
	public static String waitForTitleContains(String titleFraction,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		return null;
	}
	
	public static String waitForTitleIs(String title,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(title))) {
			return driver.getTitle();
		}
		return null;
	}

	public static String waitForTitleURLIs(String URL,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlToBe(URL))) {
			return driver.getCurrentUrl();
		}
		return null;
	}
	
	public static String waitForURLContains(String URLFraction,int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleContains(URLFraction))) {
			return driver.getCurrentUrl();
		}
		return null;
	}

}
