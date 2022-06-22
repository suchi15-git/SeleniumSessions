package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//scale vector graphics - map/graph
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");	
		Thread.sleep(5000);
		
		List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='path']"));
		System.out.println(states.size());
		
		Actions act = new Actions(driver);
		
		for(WebElement e: states) {
			act.moveToElement(e).perform();
			String name =e.getAttribute("name");
			System.out.println(name);
			
			if(name.equals("District of Columbia")) {
				act.click(e).perform();
				Thread.sleep(5000);
				//break;
				
				
				List<WebElement> counties = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='counties']//*[name()='path']"));
				System.out.println(counties.size());
				
				for(WebElement e1: counties) {
					act.moveToElement(e1).perform();					
					String countyName = e1.getAttribute("id");
					System.out.println(countyName);
				}
			}
		}
		                      
		//driver.close();

	}

}
