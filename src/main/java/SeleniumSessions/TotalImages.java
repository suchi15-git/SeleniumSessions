package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		int count = images.size();
//		System.out.println(count);

		By images = By.tagName("img");
		By links = By.tagName("a");

		int imageCount = getElementsCount(images);
		int linksCount = getElementsCount(links);
		
		System.out.println(imageCount+ " "+linksCount);

	}

//		for(WebElement img : images) {
//		String srcValue= img.getAttribute("src");
//		String altValue = img.getAttribute("alt");
//		String heightValue = img.getAttribute("height");
//		
//		System.out.println(srcValue);
//		System.out.println(altValue);
//		System.out.println(heightValue);

	// driver.close();

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
