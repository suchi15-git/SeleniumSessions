package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//whenever you are launching a browser -> browser will be launch -> then page will be launch -> page consist of frames and webelements
		//inside frame we have element
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2); //switch to frame by index
		//driver.switchTo().frame("main"); //switch to frame by name
		driver.switchTo().frame(driver.findElement(By.name("main"))); //frame is a webelement
		
		//frame and iframe -> both are same
		
		
		
		String text  = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);
		
		driver.close();
		
	

	}

}
