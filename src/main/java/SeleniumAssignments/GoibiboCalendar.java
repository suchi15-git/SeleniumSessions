package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoibiboCalendar {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		selectDate("15");

	}

	
	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//p[text()='"+dateNum+"']")).click();
	}
	
	public static void selectFutureDate(String expDateMonth, String dateNum) {
		
		

		String actMonthYear = driver.findElement(By.cssSelector(".fswFld__heading")).getText();
		System.out.println(actMonthYear);
		
		
		while(!actMonthYear.equalsIgnoreCase(expDateMonth)) {
			driver.findElement(By.cssSelector(".DayPicker-NavButton--next"));
			//actMonthYear = 
		}
	}
}
