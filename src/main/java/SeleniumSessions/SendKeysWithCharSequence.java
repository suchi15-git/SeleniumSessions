package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysWithCharSequence {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
		String str= "Naveen";
		String str1 = "Automation";
		StringBuilder str2 = new StringBuilder("admin");
		
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys(str+ " " +str1+str2);

	}

}
