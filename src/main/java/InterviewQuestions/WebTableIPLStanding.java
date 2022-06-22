package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableIPLStanding {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/points-table-standings");
	
	System.out.println(getStandingOfTeam("Gujarat Titans"));

	}

	public static List<String> getStandingOfTeam(String TeamName) {
		List<WebElement> data = driver.findElements(By.xpath("//span[contains(text(),'"+TeamName+"')]//ancestor::td//following-sibling::td"));
		List<String> dataVal = new ArrayList<String> ();
		
		for(WebElement e:data) {
			String text = e.getText();
			dataVal.add(text);
		}
		
		return dataVal;
	}
}
