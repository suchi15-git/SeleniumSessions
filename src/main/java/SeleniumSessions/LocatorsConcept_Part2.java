package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept_Part2 {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		//2 : NAME
		//id is always unique attribute. it cant be duplicate but name can be duplicate
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo-opencart.com/index.php?route=account/login");
		
//		driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("naveen@123");
		
//		By email = By.name("email");
//		By password = By.name("password");
//		
//		ElementUtil eUtil = new ElementUtil(driver);
//		eUtil.doSendKeys(email, "naveen@gmail.com");
//		eUtil.doSendKeys(password, "naveen@123");
		
		//3 : ClassName
		//it can also be duplicate . If there multiple elements with same class name , the first element will be given the priority
		// the elements which are of similar kind comes under one class hence most of the elements has single class with different fields
		
		
		driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		//4. xpath
		//it is not an attribute it is address of the element
		//inside the DOM where that element is located is find by xpath
		
		//driver.close();
		
		By email = By.xpath("//*[@id=\"input-email\"]");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By errorMsg = By.className("");
		
		
		doSendKeys(email,"naveen@gmail.com");
		doSendKeys(password,"naveen@123");
		doClick(login);
		
		String actErrorMessage = dogetElementText(errorMsg);
		
		//5 it is a locator and not an attribute
		//linktext is only for links starts with a tag
		//partiallinktext
		//tagName - only design for html tags
		

	}
	
	public static String dogetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
