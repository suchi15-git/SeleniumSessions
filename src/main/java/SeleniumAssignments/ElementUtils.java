package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {


	
	private static WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void clickSpecificFooter(By locator, String value) {
		List<WebElement> elementList = getElements(locator);
		int count = elementList.size();
		System.out.println(count);

		for (WebElement e : elementList) {
			String textF = e.getText();
			System.out.println(textF);

			if (textF.equals(value)) {
				e.click();
				break;
			}
		}

	}
	
//	public static List<WebElement> findElements(By locator) {
//		return driver.findElements(locator);
//	}
	
	
	
	
	
}
