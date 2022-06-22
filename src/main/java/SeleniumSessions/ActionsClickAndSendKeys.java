package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
		By fullname = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By ContactSales = By.linkText("CONTACT SALES");
		
		
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(fullname), "Naveen testing").perform();
		
		doActionSendKeys(email,"suchita@gmail.com");
		doActionsClick(ContactSales);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
}
