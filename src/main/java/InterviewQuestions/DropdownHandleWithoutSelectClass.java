package InterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		By countryDropdown = By.xpath("//select[@name='Country']/option");
		selectValueFromDropdown(countryDropdown, "India");

		driver.close();

	}

	public static void selectValueFromDropdown(By locator, String value) {
		List<WebElement> countryoptions = driver.findElements(locator);
		System.out.println(countryoptions.size());
		// Thread.sleep(5000);

		for (int i = 0; i < countryoptions.size(); i++) {
			String textCountry = countryoptions.get(i).getText();
			System.out.println(textCountry);

			if (textCountry.contains(value)) {
				countryoptions.get(i).click();
				break;
			}
		}
	}
}
