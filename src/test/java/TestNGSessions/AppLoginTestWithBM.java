package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTestWithBM {
	
	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
	}

	// AAA
	// you should have only one assert condition in a test
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Register Account");

	}

	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Current url is:" + url);
		Assert.assertTrue(url.contains("route=account/register"));
	}
	
	@Test
	public void cartButtonTest() {
		WebElement cartBtn = driver.findElement(By.id("cart"));
		Assert.assertTrue(cartBtn.isDisplayed());
	}

	@Test
	public void clickRegisterLinktest() {
		driver.findElement(By.linkText("Register")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
