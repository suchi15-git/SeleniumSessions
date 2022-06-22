package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLoCaSS {

static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Alberta"));
		
		String right = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();
		System.out.println(right);
	}

}
