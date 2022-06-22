package SeleniumSessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// FE - single and FEs - multiple

		// find out total number of links on the page
		// print the text for each link
		// ignore those which are having no text

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);

//		for (int i = 0; i < count; i++) {
//			String text = links.get(i).getText();
//			String hrefValue = links.get(i).getAttribute("href");
//			if (!text.isEmpty()) {
//				System.out.println(text+ " " +hrefValue);
//			}

//		for (WebElement e : links) {
//			String text = e.getText();
//			String hrefAttribute = e.getAttribute("href");
//
//			if (!text.isEmpty()) {
//				System.out.println(text + " " + hrefAttribute);
//			}
//		}
		
		//streams
		
		//links.stream().forEach(ele -> System.out.println(ele.getText()));
//		links.stream()
//		.filter(e -> !e.getText().isEmpty())
//		.forEach(e-> System.out.println(e.getText()));
		
		links
		.parallelStream()
		.filter(e -> !e.getText().isEmpty())
		.forEach(e-> System.out.println(e.getText()));

		driver.close();

	}


}
