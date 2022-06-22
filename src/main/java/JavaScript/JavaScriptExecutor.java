package JavaScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jutil = new JavaScriptUtil(driver);
//	String title = jutil.getTitleByJS();
//	System.out.println(title);
	
	//jutil.refreshpageByJS();
	
	jutil.generateAlertByJS("this is alert");
	
	driver.close();

	}

}
