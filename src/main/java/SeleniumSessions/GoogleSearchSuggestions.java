package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
		List<WebElement> suggestions= driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']/span"));
		
		System.out.println(suggestions.size());
		
		for(WebElement e:suggestions) {
			String text = e.getText();
			System.out.println(text);
			break;
			
		}
		
		driver.close();
		

	}

}
