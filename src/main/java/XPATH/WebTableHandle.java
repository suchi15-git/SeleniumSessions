package XPATH;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//xpath axis:
//		String name = "Joe.Root";
//		String xpath ="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
//		driver.findElement(By.xpath(xpath)).click();
		
		
		////a[text()='Joe.Root']/parent::td/following-sibling::td
		
		selectUser("Joe.Root");
		selectUser("Garry.White");
		
		System.out.println(getUserData("Joe.Root"));

	}

	public static void selectUser(String username) {
		String xpath ="//a[text()='"+username+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static List<String> getUserData(String username) {
		System.out.println("Username is :"+username);
		List<String> columnNames = new ArrayList<String> ();
		List<WebElement> columnVals = driver.findElements(By.xpath("a[text()='"+username+"']/parent::td/following-sibling::td"));
		for(WebElement e:columnVals) {
			String text = e.getText();
			columnNames.add(text);
		}
		
		return columnNames;
	}
}
