package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartAppTest  extends baseTest {



	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Register Account");

	}

	@Test(priority=2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Current url is:" + url);
		Assert.assertTrue(url.contains("route=account/register"));
	}
	
	@Test(priority=3)
	public void cartButtonTest() {
		WebElement cartBtn = driver.findElement(By.id("cart"));
		Assert.assertTrue(cartBtn.isDisplayed());
	}

	@Test(priority=4)
	public void clickRegisterLinktest() {
		driver.findElement(By.linkText("Register")).click();
	}


}
