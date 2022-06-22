package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumAssignments.ElementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightpanelLinksList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo-opencart.com/index.php?route=account/login");
		
		ElementUtil eUtil = new ElementUtil(driver);
		By rightpanellinks = By.xpath("//aside[@id='column-right']");
		eUtil.getAllElementsText(rightpanellinks);

		
		
		driver.close();
	}
	


}
