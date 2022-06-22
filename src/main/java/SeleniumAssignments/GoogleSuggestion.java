package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestion {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		List<WebElement> suggestCount = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));
		int size = suggestCount.size();
		System.out.println(size);
		
		
		driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span/b[contains(text(),'java')]")).click();
		
//		for(WebElement e:suggestCount) {
//			String name = e.getText();
//			System.out.println(name);
//			
//			if(name.contains("naveen automationlabs java")) {
//				e.click();
//				break;
//			}
//		}
		
		driver.close();
		
	

	}

}
