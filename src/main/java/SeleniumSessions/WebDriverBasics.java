package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup binary file: chromedriver.exce - windows, linux, mac
		//google- chromium
		//C:\Users\Suchita Kadge\Downloads\chromedriver_win32
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suchita Kadge\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle= driver.getTitle();
		String expectedTitle = "Google";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("correct");
		}
		else {
			System.out.println("Incorrect");
		}
		
		driver.quit(); //close the browser

	}

}
