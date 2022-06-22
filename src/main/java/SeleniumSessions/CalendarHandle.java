package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		selectFutureDate("July 2023", "32");

	}

	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//a[text()='" + dateNum + "']")).click();
	}

	public static void selectFutureDate(String expDateMonth, String dateNum) {

		if (expDateMonth.contains("February") && Integer.parseInt(dateNum) > 29) {
			System.out.println("Wrong date passed for the month of feb.." + dateNum);
			return;
		}

		if (Integer.parseInt(dateNum) > 31) {
			System.out.println("Wrong date passed....please pass the right day/date.." + dateNum);
			return;
		}

		driver.findElement(By.xpath("//a[text()='" + dateNum + "']")).click();
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);

		while (!actMonthYear.equalsIgnoreCase(expDateMonth)) {
			// click on next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			// break;
			selectDate(dateNum);
		}
	}
}
