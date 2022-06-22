package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMAppTest  extends baseTest{

	
	@Test(priority=1)
	public void hrmTitleTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority=2)
	public void hrmURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm-30-day-trial"));
		
	}
	

}
