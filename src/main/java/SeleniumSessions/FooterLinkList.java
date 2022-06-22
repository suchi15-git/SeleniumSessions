package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkList {

	static WebDriver driver;

	public static void main(String[] args) {

		ElementUtil eUtil = new ElementUtil(driver);
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footers = By.xpath("//ul[@class='footer-nav']//a");
		eUtil.clickOnElementFromSpecificSection(footers, "Leadership");


		// System.out.println(footers.size());

//		for(WebElement e: footers) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.equals("Leadership")){
//				e.click();
//				break;
//			}
//		}

	}

}
