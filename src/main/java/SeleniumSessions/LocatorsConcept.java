package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static 	WebDriver driver;

	public static void main(String[] args) {
		
		//create web element - (how to create elements)locators +  perform actions(click/send keys/enter/get text/isDisplayed)

		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		
		driver.get("https://demo-opencart.com/index.php?route=account/login");
		
		//id - 1ST METHOD
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2ND METHOD
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
		
		//3RD METHOD (whenever we require then only we are creating webelements and making calls to the server - just mainten the by locators)
//		By emailID = By.id("input-email");
//		By password= By.id("input-password");
//		
//		WebElement email_ID = driver.findElement(emailID);
//		WebElement pass_Word= driver.findElement(password);
//		
//		email_ID.sendKeys("email_ID");
//		pass_Word.sendKeys("pass_Word");
		
		
		//4th METHOD - by locator with generic method
//		By emailID = By.id("input-email");
//		By password= By.id("input-password");
//		
//		getElement(emailID).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		
		//5TH METHOD-by locator with generic method +get elements + actions method
//		By emailID = By.id("input-email");
//		By password= By.id("input-password");
//		
//		doSendKeys(emailID,"naveen@gmail.com");
//		doSendKeys(password,"test@123");
		
		//6th by locator with generic method with elementUTIL
		
		
		//string locator or with generic method
		
		String email_id = "input-email";
		String password_id = "input-password";
		
//		driver.close();

	}
	
	
	public static By getBy(String locatorType, String locatorValue) {
//		By locator= By.id(locatorValue);
//		return locator;
		By locator=null;
		
		switch(locatorType) {
		case "id":
			locator= By.id(locatorValue);
			break;
		
		default:
			System.out.println("Please enter valid locator...");
			break;
		}
		return locator;
	}


}
