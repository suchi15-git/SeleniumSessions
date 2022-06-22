package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPLStandingTeam {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.iplt20.com/points-table/men/2021");

		selectSeason("IPL 2021");
		System.out.println(getTeamStanding("KKR"));

		driver.close();

	}

	public static List<String> getTeamStanding(String TeamName) {
		System.out.println("The team name is:" + TeamName);
		List<WebElement> data = driver.findElements(By.xpath("//tr[@class='team0 ng-scope']//h2[contains(text(),'"
				+ TeamName + "')]/ancestor::td//preceding-sibling::td//parent::tr//following-sibling::td"));
		List<String> dataVal = new ArrayList<String>();

		for (WebElement e : data) {
			String text = e.getText();
			dataVal.add(text);
		}
		return dataVal;
	}

	public static void selectSeason(String seasonName) {
		driver.findElement(By.xpath("//div[@class='ih-t-right vn-sheduleFilter ']")).click();
		driver.findElement(By.xpath("//ul[@class='filter-list']//li/label[contains(text(),'" + seasonName + "')]"))
				.click();
	}

}
