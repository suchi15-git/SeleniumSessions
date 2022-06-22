package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it is dynamic wait and global wait
		//it will be applied on all the web elements by default
		//it cannot be applied for custom wait
		//it cannot be applicable for non-webelements - url title alert
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS); //depricated in selenium 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4.x
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("naveenautomationlabs");
		

	}

}
