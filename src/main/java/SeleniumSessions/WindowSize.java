package SeleniumSessions;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSize {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
//		Dimension dim = new Dimension();
//		dim.height= 100;
//		dim.width= 100;
		
		
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(100,100));
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		

	}

}
