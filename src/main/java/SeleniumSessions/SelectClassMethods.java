package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMethods {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		By country = By.id("Form_submitForm_Country");
		
		Select select = new Select(driver.findElement(country));
		//select.deselectAll();
		
		System.out.println(select.isMultiple());
		select.getAllSelectedOptions();
		
		driver.close();

	}

}
