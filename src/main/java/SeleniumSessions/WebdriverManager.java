package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
	
		//it is a third party library called as WDM -bonigarcia
		//you just need to add the library in the project
		
		//chrome 97- chromedriver.exe 97
		//chrome 98- chromedriver.exe 98
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suchita Kadge\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
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


