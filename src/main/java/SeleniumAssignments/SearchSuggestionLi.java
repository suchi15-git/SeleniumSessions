package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestionLi {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='ac_results']/ul//li"));
		System.out.println(options.size());
		
		for(WebElement e:options) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("Blouses > Blouse")) {
				e.click();
				break;
			}
		}
		
		
		//driver.findElement(By.xpath("//div[@class='ac_results']/ul//li[contains(text(),'Blouses > Blouse')]")).click();
		
		
		driver.close();
		

	}

}
