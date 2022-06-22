package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		By country = By.id("Form_submitForm_Country");

		ElementUtil eUtil = new ElementUtil(driver);

		List<String> countryList = eUtil.getSelectDropdownOptionsList(country);

		if (countryList.contains("India")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

		driver.close();
	}
}
