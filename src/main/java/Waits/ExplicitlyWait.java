package Waits;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {
	static WebDriver driver;
	public static void main(String[] args) {

		//explicitly you have to wait for specific element
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By contactNum = By.id("Form_submitForm_Contact");
		

		
		//name_ele.sendKeys("naveen");
		
		
		waitForElementPresent(name,10).sendKeys("naveen");
		waitForElementPresent(email,5).sendKeys("naveen@gmail.com");
		getElement(contactNum).sendKeys("12345");
		
		
		//driver.findElement(email).sendKeys("naveen@gmail.com");
		//driver.findElement(contactNum).sendKeys("12344");
		

		
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/* An expectation for checking that an element is present on the DOM of the page
	 * This does not necessarily mean that an element is visible
	 * @parameter locator
	 * @parameter timeout
	 * @return
	 */
	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	/* An expectation for checking that an element is visible on the DOM of the page and visible
	 * Visibility means that this element not only displayed
	 * but also has height and width greater than 0
	 * @parameter locator
	 * @parameter timeout
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
}
