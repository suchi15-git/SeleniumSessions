package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFindLastElement {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement lastLink = driver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'][last()]/ul/li)[last()]"));
		
		String helpText = lastLink
								.getText();
		
		System.out.println(helpText);
		
		if(helpText.equals("Help")) {
			lastLink.click();
		}

		driver.close();
	}

}
