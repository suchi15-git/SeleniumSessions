package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUpHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		//pop-up is coming with user auth and password
		//this is not JS pop-up
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String username = "admin";
		String password = "admin";
		driver.get("https://"+username+":"+password+"admin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Alert alert = driver.switchTo().alert();
	
		
		

	}

}
