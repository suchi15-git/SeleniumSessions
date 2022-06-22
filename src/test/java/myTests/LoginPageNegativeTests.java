package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTests extends baseTest{
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[] []{
			{"t678999est@gmail.com","test"},
			{"naveen@gmail.com","test1212"},
			{"",""},
			{"#$$$test","458&&*"}
		};
	}
	
	@Test(dataProvider="getLoginData")
	public void loginWithWrongDataTest(	String username,String password) {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errormsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errormsg);
		Assert.assertTrue(errormsg.contains("Warning: No match for E-Mail Address and/or Password."));
	}

}
