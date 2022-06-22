package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		//CSS doesnt support svg element
		//for shadow dom xpath wont work, only 
		//browser -> page -> iframe -> shadowDOM -> input field -> send keys

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.switchTo().frame("pact");
		
		JavascriptExecutor js = 	(JavascriptExecutor) driver;
		WebElement tea = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		System.out.println(tea.getText());
		
		tea.sendKeys("masala tea");
	}

}
