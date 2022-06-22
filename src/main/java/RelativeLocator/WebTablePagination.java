package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTablePagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='Naveen']")).size()>0 ){
				selectCity1("Naveen");
				break;
			}
			
			else {
				//pagination logic
				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over and city is not found!");
					break;
				}
				
				next.click();
				Thread.sleep(1000);
			}
		}

	}

	
	public static void selectCity(String cityName) {
		String checkbox_xpath = "//td[text()='"+cityName+"']/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkbox_xpath)).click();;
	}
	
	public static void selectCity1(String cityName) {
		WebElement ele = driver.findElement(By.xpath("td[text()='"+cityName+"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
	}
}
