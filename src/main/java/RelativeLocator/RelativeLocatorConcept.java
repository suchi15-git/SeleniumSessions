package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorConcept {

static WebDriver driver;
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("North-Bay, Canada"));
		//right of ele -->tagname (p)
		
		String right = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(right);
		
		String left = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(left);
	
		String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);
		
		String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);
	}

}
