package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util{
	
	public WebDriver driver;
	

	

	@Override
	public void navigateURL(String url) {
		// TODO Auto-generated method stub
		
		if(url==null) {
			return;
		}
		
		if(url.isEmpty()) {
			return;
		}
		
		if(url.indexOf("http")==-1&& url.indexOf("https")==-1) {
			System.out.println("please pass the right url, http(S) is missing..");
			return;
		}
		
		driver.get(url);
		
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		
		return driver.getTitle();
		
	}

	@Override
	public String getPageURL() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
		
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}


	public WebDriver initialize_Driver(String browserName) {
		
		//use switch case statement - assignment for today :)
		
		switch(browserName) {
		
		case CHROME_BROWSER:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case FIREFOX_BROWSER:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case SAFARI_BROWSER:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass the right browserName...");
			
		}
		
		return driver;
			
		
//		
//		System.out.println("browser name is:"+browserName);
//		if(browserName.equalsIgnoreCase(CHROME_BROWSER)) {
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if (browserName.equalsIgnoreCase(FIREFOX_BROWSER)) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		
//		else if(browserName.equalsIgnoreCase(SAFARI_BROWSER)){
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//			
//		}
//		
//		else {
//			System.out.println("Please pass the right url");
//		}
		
		//return driver;
	
	}

	@Override
	public void navigateURL(URL url) {
		// TODO Auto-generated method stub
		
	}


}
