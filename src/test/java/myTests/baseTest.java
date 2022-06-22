package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	WebDriver driver;
	
    
	@Parameters({"browser","url","headless"})
	@BeforeTest
	public void setUp(String browserName, String appURL, String headless) {
		
		System.out.println("Browsername is :" +browserName);
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		if(Boolean.parseBoolean(headless)) {
			co.setHeadless(true);
		}
		driver= new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.chromedriver().setup();
			driver =new SafariDriver();
		}
		driver.get(appURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
			
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
