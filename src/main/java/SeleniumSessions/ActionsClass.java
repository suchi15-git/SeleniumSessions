package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//user actions
		//move to element concept
		//.build() - when we have multiple actions 
		//.perform() - is used for single action
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//li/a[@class='menulink']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
		
		driver.close();
	}

}
