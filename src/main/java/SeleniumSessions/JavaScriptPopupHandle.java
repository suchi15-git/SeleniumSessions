package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopupHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//in javascript pop-up u cannot inspect anything on that pop-up
		//it has no webelement
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert= driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		//alert.sendKeys("");
		alert.accept(); //just click on ok accept the alert
		//alert.dismiss(); //no need to accept the alert press esc
		//alert("msg")
		//prompt(msg")
		//confirmation("are u sure")
		
		driver.close();
		
		

	}

}
