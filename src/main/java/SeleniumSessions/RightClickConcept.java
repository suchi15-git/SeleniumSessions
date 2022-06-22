package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
//		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		Actions act = new Actions (driver);
//		act.contextClick(rightClickEle).perform();
		
		By locator = By.xpath("//span[text()='right click me']");
		
		rightClickEle(locator);
		
		List<WebElement> rightList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon context-menu-icon')]"));
		
//		for(WebElement e: rightList) {
//			String text = e.getText();
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//				
//			}
//			
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//		
//		}

		
		for(int i = 0; i<rightList.size();i++) {
			String text = rightList.get(i).getText();
			System.out.println(text);
			
			rightList.get(i).click();
			Thread.sleep(3000);
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
//			if(i<rightList.size()-1)
//				rightClickEle(locator);
			
			if(i!=rightList.size()-1) {
				rightClickEle(locator);
			}
			
			
		}
		
		
	}
	
	public static void rightClickEle(By locator) {
		
		WebElement rightClickEle= driver.findElement(locator);
		Actions act = new Actions (driver);
		act.contextClick(rightClickEle).perform();
	
	}

	
}
