package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	 static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo-opencart.com/index.php?route=account/login");
		
		//1st method
		driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.name("password")).sendKeys("naveen@123");
		
		//2nd method
		WebElement email= driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		email.sendKeys("naveen@gmail.com");
		password.sendKeys("naveen@123");
		
		//3rd method
		By email_id = By.name("email");
		By password_id = By.name("password");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.getElement(email_id).sendKeys("naveen@gmail.com");
		eUtil.getElement(password_id).sendKeys("naveen@123");
		
		//4th method
		By email_id1 = By.name("email");
		By password_id1 = By.name("password");
		
		eUtil.doSendKeys(email_id1, "naveen@gmail.com");
		eUtil.doSendKeys(password_id1, "naveen@123");
		
		//5th method : by locator with generic method in element util class
		By email_id2 = By.name("email");
		By password_id2 = By.name("password");
		
		
		//7th method
		String email_id7 = "input-email";
		String password_id7 = "input-password";
		
		//eUtil.doSendKeys(getBy("id","email_id7"),"naveen@gmail.com");
		//eUtil.doSendKeys(getBy("id" ," password_id7"),"naveen@123");
		
		
		
		//driver.close();
		
		

	
	

		
	
	}

}
