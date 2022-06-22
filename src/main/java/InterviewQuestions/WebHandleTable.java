package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebHandleTable {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2022-1298423/delhi-capitals-vs-lucknow-super-giants-45th-match-1304091/full-scorecard");
		
		
		//WebElement playerRecord = driver.findElement(By.xpath("//span[contains(text(),'Axar Patel')]/ancestor::td/following-sibling::td"));
		System.out.println(getWicketTakerName("David Warner"));
		System.out.println(getPlayerScoreList("David Warner"));
	}

	public static String getWicketTakerName(String playerName) {
		WebElement playerRecord = driver.findElement(By.xpath("//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td"));
		return playerRecord.getText();
		
	
	}
	
	public static List<String> getPlayerScoreList(String playerName) {
		System.out.println("Player name is:" +playerName);
		String sc_xpath = "//table[contains(@class,ci-scorecard-table)]//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(sc_xpath));
		List<String> scoreValList = new ArrayList<String>();
		
		for(WebElement e:scoreList) {
			String score = e.getText();
			scoreValList.add(score);
		}
		
		return scoreValList;
	}
}
