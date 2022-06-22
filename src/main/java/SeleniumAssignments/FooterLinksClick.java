package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksClick {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
//		List<WebElement> linksF = driver.findElements(By.xpath("//footer//ul[@class='footer-nav']//a"));
//		int count = linksF.size();
//		System.out.println(count);

//		for(WebElement e:linksF) {
//			String textF = e.getText();
//			System.out.println(textF);
//			
//			if(textF.contains("Freshdesk")) {
//				e.click();
//				break;
//			}
//		}

		By locF = By.xpath("//footer//ul[@class='footer-nav']//a");

		ElementUtils eUtils = new ElementUtils(driver);
		eUtils.clickSpecificFooter(locF, "Freshdesk");


		driver.close();

	}


}
