package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		By country = By.id("Form_submitForm_Country");
		doSelectDropdownByIndex(country,5);
		Thread.sleep(5000);
		doSelectDropdownByIndex(country,6);
		Thread.sleep(5000);
		doSelectDropdownByVisibleText(country,"Belize");
		Thread.sleep(5000);
//		WebElement country_ele = driver.findElement(country);
		
//		Select select = new Select(country_ele);	
//		select.selectByIndex(5);
//		select.selectByVisibleText("Belize");
//		select.selectByValue("Belize");
		driver.close();
		
		
		//dropdown - html tag -> select -> option
		//select class
		
		
		

	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropdownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
